import java.util.ArrayList;
import java.util.Comparator;
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
