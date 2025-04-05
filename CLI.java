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
