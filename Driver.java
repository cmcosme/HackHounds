/**
* This is my code! It's goal is to store products in the Inventory.
* HackHounds 2024, PET (Product Expiration Tracker)
* @author Camila Cosme, Donovan, Henry, Gigi
* @version a.1
*/


import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Iterator;

public class Driver{	
	public static void main(String[] args){

	Inventory inven = new Inventory();
	//testing methods

/*
		Product item = new Product("04-12-2025", "fruit", "g", "apple", "fridge", "cooked");
		Product item2 = new Product("04-11-2025", "fruit", "g", "pineapple", "fridge", "cooked");
		inven.addProduct(item);
		inven.addProduct(item2);
		inven.iterate();

		//display by date sorted
		System.out.println("Sorted");
		inven.displayExpDate();

		//testing remove
		System.out.println("Remove successful");
		inven.removeProduct(item);
		inven.iterate();

		//testing


		//find product
		inven.findProduct("apple");

*/

	//Create CLI
	CLI cli = new CLI(inven);

	//error checking
	try{
		cli.processor(args);
	}catch (ArrayIndexOutOfBoundsException ex){
		System.out.println ("\nMissing argument. Please refer below: ");
		cli.menu(); //menu options
	}
	}

// Ctrl + D signal end of input (EOF means end of file signal)
// Code mainly from lab4 - MakeInformal
	
	/**
	 * Reads file to put into inventory.
	 * @param inven - Inventory to put Items.
	 */

	public void fileReader(Inventory inven){	
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()){
			String line = input.nextLine();
			StringTokenizer tok = new StringTokenizer (line, ",");
			if (tok.countTokens() == 6){
				String name = tok.nextToken();
                		String type = tok.nextToken();
                		String location = tok.nextToken();
                       		String raw= tok.nextToken();
                        	String date = tok.nextToken();
                        	String status= tok.nextToken();

				Driver driver = new Driver();
				Product newProduct = new Product(status, type, date, name, raw, location);
				inven.addProduct(newProduct);
			}
		}
	}

}
	
