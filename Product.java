

public class Product{
        
	//attributes
	protected String expiration; //expiration date
        protected String type; //type of product
	protected String status; // (3) Good, about to expire, expired 
	protected String productName; // name of the product
	protected String location;
	protected String cooked;
	
	//constructor
	public Product(String ex, String ty, String stats, String name, String location, boolean cooked){
		expiration = ex;
		type = ty;
		status = stats;
		productName = name;
		this.location = location;
		this.cooked = cooked;
	
	//methods
	
	/**
	 * Clock method to track day. 
	 */

	/**
	 * Updates the status of the item depending on date - expiration date.
	 */
	public void updateStatus(){
		//x
	} 
	
	/**
	 * Calculates how many days until item expires.
	 */
	public int expDate() {}

	/**
	 * Format nicely.
	 */
	public String toString(){
		return productName + ", " + type + ", " + location + ", " + cooked + ", " + expiration; 
		
	}
	}
}
