
import java.util.Iterator;

public class Driver{	
	public static void main(String[] args){

	Inventory inven = new Inventory();
	//testing methods


		Product item = new Product("04-12-2025", "fruit", "g", "apple", "fridge", "cooked");
		Product item2 = new Product("04-12-2025", "fruit", "g", "pineapple", "fridge", "cooked");
		inven.addProduct(item);
		inven.addProduct(item2);
		inven.iterate();

		inven.displayExpDate();

		//testing remove
		System.out.println("Remove successful");
		inven.removeProduct(item);
		inven.iterate();

		//testing


		//find product
		inven.findProduct("apple");






/*
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
/*
	public void fileReader(Inventory inven){	
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()){
			String line = input.nextLine();
			StringTokenizer tok = new StringTokenizer (line, ";");
			if (tok.countTokens() == 6){
				String title = tok.nextToken();
                		String type = tok.nextToken();
                		String price = tok.nextToken();
                       		String prop1 = tok.nextToken();
                        	String prop2 = tok.nextToken();
                        	String status = tok.nextToken();
				Driver driver = new Driver();
				Product newProduct = new Product (title, type, price, prop1, prop2, status);
				inven.addToInventory(item);
			}
		}
	}

*/

	}
		

}
