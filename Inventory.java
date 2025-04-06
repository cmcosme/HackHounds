/**
* This is my code! It's goal is to store products in the Inventory.
* HackHounds 2024, PET (Product Expiration Tracker)
* @author Camila Cosme, Donovan, Henry, Gigi
* @version a.1
*/


import java.util.ArrayList;
import java.util.Iterator;
import java.time.LocalDate;
import java.util.Collections; 

public class Inventory{
	protected ArrayList <Product> products;

	/**
	 * Constructor for Inventory.
	 */
	public Inventory(){
		products = new ArrayList<>();
	}

	/**
	 * Add a product to Array list.
	 * @param newProduct is the new product to add to the ArrayList.
	 */
	public void addProduct(Product newProduct){
		products.add(newProduct);
		      
	};

	/**
	 * Remove product from list using the name of the product.
	 * @param name - name of the product. 
	 */
	public void removeProduct(String name){
		Iterator <Product> itr = products.iterator();
                while (itr.hasNext()){
                       Product nextPlace = itr.next();
                       if (!nextPlace.isProduct(name)){
                               System.out.println(nextPlace);
                        }
                }

        }

/*
	/**
	 * Remove product by _.
	 */
/*	public void removeProduct(String name){
		ArrayList<Product> temp = new ArrayList<>();
		for(int i = 0; i < products.size(); i++){
			if(!(product.isProduct(name))){
				temp.add(product);

			}
		}
	}
*/
	/**
	 * Display information by sorting by product expiration dates.
	 */
	public void displayExpDate(){
		Collections.sort(products);
		for (Product product: products){
			System.out.println(product);
		}
	}
/*
	/**
	 * Display by expiration date, closest to expire - furtheset to expire. 
	 */
	//
/*	public void displayExpDate(){
		// This will store the product names and their expiration dates in an integer format
		TreeMap<Integer, String> listSort = new TreeMap<>();

		for (int i = 0; i < products.size(); i++) {
			// Parse the expiration date in the format dd/mm/yyyy
			String[] arr = products.get(i).expiration.split("-"); // Expiration is assumed to be in "dd/MM/yyyy" format
			String expiration = arr[2] + arr[1] + arr[0];  // Convert to yyyymmdd format
			int total = Integer.parseInt(expiration);      // Convert string to integer (yyyymmdd)
			listSort.put(total, products.get(i).productName);      // Use expiration date as key, product name as value
		}

		// Now listSort is sorted by expiration date (ascending order) because TreeMap sorts by keys
		for (Map.Entry<Integer, String> entry : listSort.entrySet()) {
			System.out.println(entry.getValue() + " - Expiration: " + entry.getKey());
		}
	}
*/
	/**
	 * Find product.
	 */
	public ArrayList<Product> findProduct(String name){
		ArrayList <Product> temp = new ArrayList<>();
		Iterator <Product> itr = products.iterator();
		while (itr.hasNext()){
			Product nextPlace = itr.next();
			if (nextPlace.isProduct(name)){
				temp.add(nextPlace);
			}
		}
		return temp;
	}

	/**
	 * Find product and print it out.
	 */
	public void displayProductName(String product){
		ArrayList <Product> tempArr = findProduct(product);
		for (Product products : tempArr){
			System.out.println(products);
		}
	}


	/**
	 * Display all. 
	 */
	public void iterate(){
		Iterator <Product> itr = products.iterator();
		while (itr.hasNext()){
			Product nextPlace = itr.next();
			System.out.println(nextPlace);
		}
	}





}
