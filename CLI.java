public class CLI{

	//attributes
	protected Inventory inventory;
	
	
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

				else if (args[1].equals("-")){ //compares arg1 to see if it's -f
                                        drive.fileReader(inventory);
					inventory.display(args[2]); //Display items with matching Title
				}

				else if (args[1].equals("-a")){ //compares arg1 to see if it's -a
                                        drive.fileReader(inventory);
					inventory.displayMatchingAuthor(args[2]); //Display items with mathching Authors
                                }
				break;

			case "-a": //add item
				Product temp  = new Product(args[4], args[2], args[5], args[6], args[1], args[3]);
				inventory.addToInventory(temp);
				inventory.iterate();

			case "-s"://removes flag
				
				if (args.length < 2){ //if there is one argument
                                        drive.fileReader(inventory);
					inventory.removeProduct(args[2]); //Display items with matching Title
                                }
	
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
			"\nUsage: java Driver [-d|-a|-s] <options>" +
			"\nthere are three command line options" +
			"\n(display) -d [(everything by default) | -t \"title\" | -a \"author\" ]" +
			"\n(add) -a Product \"Product_name\" type_of_product location [ cooked|raw ] expiration status" +
			"\n(remove) -s [-t title | -a author]\n");
	}








}
