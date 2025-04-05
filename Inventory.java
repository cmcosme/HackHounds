import java.util.ArrayList;
import java.util.Comparator;

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

	/**
	 * Remove product by _.
	 */
	public void removeProduct(String name){
		for(int i = 0; i < products.size(); i++){
			if(name.equals(products.get(i).productName)) products.remove(i);
		}

	}

	/**
	 * Display by expiration date, closest to expire - furtheset to expire. 
	 */
	public void display(){
	}

	/**
	 * Find product. 
	 */
	//public void displayProduct(){}
	

	/**
	 *
	 */




}
