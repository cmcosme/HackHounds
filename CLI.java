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
			"\n(add) -a DVD \"title\" cost year \"studio\" [ NEW|USED ]" +
			"\n(add) -a CD \"title\" cost year \"band\" [ NEW|USED ]" +
			"\n(add) -a BOOK \"title\" cost author genre [ NEW|USED ]" +
			"\n(add) -a AUDIOBOOK \"title\" cost author \"reader\" [ NEW|USED ]" +
			"\n(sell all) -s [-t title | -a author]\n");
	}








}
