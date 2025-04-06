import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;
import java.time.LocalDate;
 

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
	public void removeProduct(Product product){
		for(int i = 0; i < products.size(); i++){
			if(product.productName.equals(products.get(i).productName)) products.remove(i);
		}

	}

	/**
	 * Display by expiration date, closest to expire - furtheset to expire. 
	 */
	public void display(Inventory inventory){
		// This will store the product names and their expiration dates in an integer format
		TreeMap<Integer, String> listSort = new TreeMap<>();

		for (Product product : products) {
			// Parse the expiration date in the format dd/mm/yyyy
			String[] arr = product.expiration.split("/"); // Expiration is assumed to be in "dd/MM/yyyy" format
			String expiration = arr[2] + arr[1] + arr[0];  // Convert to yyyymmdd format
			int total = Integer.parseInt(expiration);      // Convert string to integer (yyyymmdd)
			listSort.put(total, product.productName);      // Use expiration date as key, product name as value
		}

		// Now listSort is sorted by expiration date (ascending order) because TreeMap sorts by keys
		for (Map.Entry<Integer, String> entry : listSort.entrySet()) {
			System.out.println(entry.getValue() + " - Expiration: " + entry.getKey());
		}
	}

	/**
	 * Find product. 
	 */
	//public void displayProduct(){}
	

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
