/**
* This is my code! It's goal is for Command Line Interface.
* HackHounds 2024, PET (Product Expiration Tracker)
* @author Camila Cosme, Donovan, Henry, Gigi
* @version a.1
*/
public class CLI{
	protected Inventory inventory;
	Driver drive = new Driver();
	
	
	/**
	 * CLI constructor using given Inventory.
	 */
	public CLI (Inventory inventory){
		this.inventory = inventory;

	}
	

	/**
	 * Process the CLI
	 * @param args - user's arguments
	 */
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

				else if (args[1].equals("-f")){//finds and display certain item.
					//drive.fileReader(inventory);
					drive.fileReader(inventory);
					inventory.displayProductName(args[2]);
				}
					

				else if (args[1].equals("-e")){ //sorts by expiration date
					Product item = new Product("04-12-2025", "fruddit", "g", "apple", "fridge", "cooked");
					inventory.addProduct(item);
                                        Product item2 = new Product("04-11-2025", "fruit", "g", "pineapple", "fridge", "cooked");
					inventory.addProduct(item2);
					inventory.displayExpDate(); //display from closes expired to furthest. 
					}
                             
				break;

			case "-a": //add item
				Product temp  = new Product(args[5], args[2], args[6], args[1], args[4], args[3]);
				drive.fileReader(inventory); //read file
				inventory.addProduct(temp); //add new product to list. 
				inventory.iterate(); //print list
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
			"\n(display) -d < inputFile | -e \"sorted by expiration date\" | -f <name of product> display certain item < inputFile" +
			"(add) -a Product \"Product_name\" type_of_product storage_type [cooked|raw] mm/dd/yyyy status <filename_read> outputFile" +
			"\n(remove) -r <product name>\n");
	}


}
