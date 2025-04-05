import java.util.ArrayList;
public class Inventory{
	//attribute
	protected ArrayList <Products> products;

	//constructor
	/**
	 * Constructor for Inventory.
	 */
	public Inventory(){
		product = new ArrayList<>();
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
	//public void removeProduct(){ };

	/**
	 * Display by expiration date, closest to expire - furtheset to expire. 
	 */
	public void display(){ 
		products.sort(Comparator.reverseOrder());
			
	}

	/**
	 * Find product. 
	 */
	//public void displayProduct(){}
	

	/**
	 *
	 */




}
