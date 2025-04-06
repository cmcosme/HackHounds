import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;
import java.time.LocalDate;
import java.util.Collections; 

public class Inventory{
	//attribute
	protected ArrayList <Product> products;

	//constructor
	/**
	 * Constructor for Inventory.
	 */
	public Inventory(){
		products = new ArrayList<>();
	}

	//methods
	/**
	 * Add a product to Array list.
	 * @param newProduct is the new product to add to the ArrayList.
	 */
	public void addProduct(Product newProduct){
		products.add(newProduct);
		      
	};



	public void date(){
                LocalDate date = LocalDate.now();//create date object
                System.out.println(date);
        }



	/**
	 * Remove product by _.
	 */
	public void removeProduct(String name){
		ArrayList<Product> temp = new ArrayList<>();
		for(int i = 0; i < products.size(); i++){
			if(!name.equals(products.get(i).productName)){
				temp.add(products.get(i));
			}
		}
		products = temp;
	}

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

	public void displayProductName(String product){
		ArrayList <Product> tempArr = findProduct(product);
		for (Product products : tempArr){
			System.out.println(product);
		}
	}


	/**
	 * Print
	 */
	public void iterate(){
		Iterator <Product> itr = products.iterator();
		while (itr.hasNext()){
			Product nextPlace = itr.next();
			System.out.println(nextPlace);
		}
	}





}
