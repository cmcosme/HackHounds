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

				else if (args[1].equals("-t")){ //compares arg1 to see if it's -f
                                        drive.fileReader(inventory);
					inventory.displayMatchingTitle(args[2]); //Display items with matching Title
				}

				else if (args[1].equals("-a")){ //compares arg1 to see if it's -a
                                        drive.fileReader(inventory);
					inventory.displayMatchingAuthor(args[2]); //Display items with mathching Authors
                                }
				break;

			case "-a": //add item
				if (args.length < 7){
					System.out.println ("Not enought arguments: ");
					break;
				}
				//Error checking
				double cost = -1;
				int year = 0 ;

				try {//error check if String args[3] can be double
					cost = Double.parseDouble(args[3]);
				}catch (NumberFormatException e){
					System.out.println ("Invalid argument for COST: ");
				}

				try {//error check if String args[4] can be int
                                        year = Integer.parseInt(args[4]);
                                }catch (NumberFormatException e){
					args[4] = args[4];
                                }

				if (cost < 0){ //error checks number (Negitive number)
					System.out.println ("Invalid number for COST: ");
				}
				
				if (!args[6].equals("NEW") && !args[6].equals("USED")){
					System.out.println ("Invalid argument for NEW or USED: ");
				}
				


				//create object
				else if (args[1].equals("DVD")){ //compares arg1 to see if it's -f
                                	drive.fileReader(inventory);
					if (year > 2025 || year < 1 ){ //error checks year (Greater than 2025 less than 0)
                                        System.out.println("Invalid number for YEAR: ");
					break;
					}

					Item dvd  = new DVD(args[2], args[1], cost, year, args[5], args[6]);
					inventory.addToInventory(dvd);
					inventory.iterate();
				}

				else if (args[1].equals("CD")){ //compares arg1 to see if it's -a
                                	drive.fileReader(inventory);
					if (year > 2025 || year < 1 ){ //error checks year (Greater than 2025 less than 0)
                                        System.out.println("Invalid number for YEAR: ");
                                        break;
                                        }

					Item cd = new CD(args[2], args[1],cost, year, args[5], args[6]);
					System.out.println (cd);
					inventory.addToInventory(cd);
					inventory.iterate();
				}

				else if (args[1].equals("BOOK")){ //compares arg1 to see if it's -f
                                	drive.fileReader(inventory);
					Item pb = new PrintBook (args[2], args[1], cost, args[4], args[5], args[6]);
					inventory.addToInventory(pb);
					inventory.iterate();

				}

				else if (args[1].equals("AUDIOBOOK")){ //compares arg1 to see if it's -a
                                	drive.fileReader(inventory);
					Item ab = new AudioBook(args[2], args[1], cost, args[4], args[5], args[6]);
					inventory.addToInventory(ab);
					inventory.iterate();

				}

				break;

			case "-s"://removes flag
				
				if (args.length < 2){ //if there is one argument
                                        drive.fileReader(inventory);
					inventory.removeAll(); //Sell all
                                }

                                else if (args[1].equals("-t")){ //compares arg1 to see if it's -f
                                        drive.fileReader(inventory);
					inventory.removeMatchingTitle(args[2]); //Display items with matching Title
                                }

                                else if (args[1].equals("-a")){ //compares arg1 to see if it's -a
                                        drive.fileReader(inventory);
					inventory.removeMatchingAuthor(args[2]); //Display items with mathching Authors
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
