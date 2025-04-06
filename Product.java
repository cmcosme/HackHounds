import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Product{
        
	//attributes
	protected String expiration; //expiration date
        protected String type; //type of product
	protected String status; // (3) Good, about to expire, expired 
	protected String productName; // name of the product
	protected String location;
	protected String cooked;
	
	//constructor
	public Product(String ex, String ty, String stats, String name, String location, String cooked){
		expiration = ex;
		type = ty;
		status = stats;
		productName = name;
		this.location = location;
		this.cooked = cooked;
	}
	
	//methods
	
	/**
	 * Updates the status of the item depending on date - expiration date.
	 */
	public void updateStatus(String otherDate){
		int currDate;
		int otherDate;
		
		//get current date
		LocalDate date = LocalDate.now();//create date object
		String[] a = date.split("-");
		String combineA = a.args[0] + a.args[1] + a.args[2];
		try{
			currDate = Integer.parseInt(combineA);
		}catch (NumberFormatException e){
			System.out.println("Invalid number.")
		}

		// other date
		String[] b = otherDate.split("-");
		String combineB = b.args[2] + b.args[0] + b.args[1];
		try{
                        otherDate = Integer.parseInt(combineB);
                }catch (NumberFormatException e){
                        System.out.println("Invalid number.")
                }

		int expDate = otherDate - currDate; //gets days until expiration
						    //
		if (expDate > 3){ //if greater than 3, print days to expire. 
			this.status = "Good: " + expDate + " days until expiration";
		if (expDate <= 3) //if 3 or less, tell user how many days until expired
			this.status = "About to go bad: " + expDate + " days until expiration.";
		} // if 0 or less, it's expired.
		if (expDate <= 0){
			this.status = "Expired";

		}	
	}

	public void expirationDate(String type){
		//get local date as int
		LocalDate date = LocalDate.now();//create date object


		//add to date
		switch(type.toLowerCase){
		case "meat":
			this.expiration = ;
			break;
		case "fruit":
			this.expiration = ;
			break;
		case "grain": 
			this.expiration = ;
			break;
		case "vegetable": 
			this.expiration = ;
			break;
		case "nut":
			this.expiration = ;
			break;
		case "egg":
			this.expiration = ;
			break;
		case "dairy":
			this.expiration = ;
			break;
		case "processed":
			this.expiration = ;
			break;
		case "medicine":
			this.expiration = ;
			break;
		case "spices":
			this.expiration = ;
			break;
		case "leftovers":
			this.expiration = ;
			break;
		case "other": 
			this.expiration = ;
			break;

		}
	}
	
	/**
	 * Format nicely.
	 */
	public String toString(){
		return productName + ", " + type + ", " + location + ", " + cooked + ", " + expiration; 
		
	}
	
}
