/**
* This is my code! It's goal is to store products in the Inventory.
* HackHounds 2024, PET (Product Expiration Tracker)
* @author Camila Cosme, Donovan, Henry, Gigi
* @version a.1
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Product implements Comparable<Product>{
	protected String expiration; //expiration date
	protected String type; //type of product
	protected String status; // (3) Good, about to expire, expired 
	protected String productName; // name of the product
	protected String location;
	protected String cooked;
	
	public Product(String ex, String ty, String stats, String name, String location, String cooked){
		expiration = ex;
		type = ty;
		status = stats;
	 	productName = name;
		this.location = location;
		this.cooked = cooked;
	}
	
	
	/**
	 * Updates the status of the item depending on date - expiration date.
	 */
	public void updateStatus(String otherDate){
		int currDate = -1;
		int date2 = -1;
		
		//get current date
		LocalDate date = LocalDate.now();//create date object
		String[] a = date.toString().split("-");
		String combineA = a[0] + a[1] + a[2];
		try{
			currDate = Integer.parseInt(combineA);
		}catch (NumberFormatException e){
			System.out.println("Invalid number.");
		}

		// other date
		String[] b = this.expiration.split("-");
		String combineB = b[2] + b[0] + b[1];
		try{
                        date2 = Integer.parseInt(combineB);
                }catch (NumberFormatException e){
                        System.out.println("Invalid number.");
                }

		int expDate = date2 - currDate; //gets days until expiration
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

	/**
	 * Check to see if product exists. 
	 */
	public boolean isProduct(String name){
		return this.productName.equals(name);
	}

	/*
	public void expirationDate(String type){
		//get local date as int
		LocalDate date = LocalDate.now();//create date object
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		

		//add to date
		switch(type.toLowerCase()){
		case "meat":
			this.expiration = date.plusDays().format(dateFormatter);
			break;
		case "fruit":
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter) ;
			break;
		case "grain": 
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;
		case "vegetable": 
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;
		case "nut":
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;
		case "egg":
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;
		case "dairy":
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;
		case "processed":
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;
		case "medicine":
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;
		case "spices":
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;
		case "leftovers":
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;
		case "other": 
			this.expiration = date.plusDays(daystoAdd).format(dateFormatter);
			break;

		}
	}
	*/

	/**
	 * Compares product's expiration date to sort
	 */	
	@Override
	public int compareTo(Product x){
		//return this.exponent - x.exponent; //ascending order - need decending order
		int date = -1;
		int date2 = -1;

		String[] a = x.expiration.split("-");
                String combineA= a[2] + a[0] + a[1];
                try{
                        date = Integer.parseInt(combineA);
                }catch (NumberFormatException e){
                        System.out.println("Invalid number.");
                }

		
		String[] b = this.expiration.split("-");
                String combineB = b[2] + b[0] + b[1];
                try{
                        date2 = Integer.parseInt(combineB);
                }catch (NumberFormatException e){
                        System.out.println("Invalid number.");
                }

		
		
		return date2 - date;
	}



	/**
	 * Format nicely.
	 */
	public String toString(){
		return productName + ", " + type + ", " + location + ", " + cooked + ", " + status + ", " + expiration; 
		
	}
	
}
