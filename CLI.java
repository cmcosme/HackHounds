public class CLI{

	//attributes
	protected Inventory inventory;
	Driver drive = new Driver();
	
	
	//methods
	/**
	 * CLI constructor using given Inventory.
	 */
	public CLI (Inventory inventory){
		this.inventory = inventory;

	}
	

	public void processor (String[] args){
		if (args.length == 0){ //if there are no arguments
			System.out.println ("\nInvalid number of arguments provided: ");
			menu();
			return;
		}


		switch(args[0]){
			case "-d": //display product
				if (args.length < 2){ //if there is one argument
					drive.fileReader(inventory);
					inventory.iterate(); //Display all
				}

				else if (args[1].equals("-e")){ //compares arg1 to see if it's -f
                                        drive.fileReader(inventory);
					inventory.displayExpDate(); //Display items with matching Title
					}
                             
				break;

			case "-a": //add item
				//if (args.length < 7){
				//	System.out.println ("Not enought arguments: ");
				//	break;
				//}
				Product temp  = new Product(args[5], args[2], args[6], args[1], args[4], args[3]);
				drive.fileReader(inventory);
				inventory.addProduct(temp);
				inventory.iterate();
				break;

			case "-r"://removes flag
					drive.fileReader(inventory);
					inventory.removeProduct(args[1]); //Display items with matching name
                                
	
				break;

			default: //error checking
				System.out.println ("Invalid Flag. Please refer below: ");
				menu();
				break;				
		}

	}



	/**
	 * Prints out menu options
	 */
	public static void menu(){
		System.out.println (
			"MENU: "+
			"\nUsage: java Driver [-d|-a|-r] <options>" +
			"\nthere are three command line options" +
			"\n(display) -d | -e \"sorted by expiration date\"" +
			"\n(add) -a Product \"Product_name\" type_of_product location [ cooked|raw ] expiration status" +
			"\n(remove) -r \n");
	}








}
