/*
 * Pizza.java
 */
/**
 * 
 * This class calculates price of pizza according to size and number of toppings 
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */

public class Pizza {
/***
 * size_of_pizza			 Instance private variable to store size of pizza
 * number_of_cheese_topping  Instance private variable to store number of cheese toppings
 * number_of_peproni_topping Instance private variable to store number of pepperoni 
 * 							 toppings
 * number_of_ham_topping	 Instance private variable to store number of ham toppings
 */
private String size_of_pizza = null;
private int number_of_cheese_topping = 0;
private int number_of_pepperoni_topping = 0;
private int number_of_ham_topping = 0;
/**
 * Constructor that sets value of instance variables
 * @param size		Variable that set value of size
 * @param cheese	Variable that set value of cheese toppings
 * @param pepperoni Variable that set value of pepperoni toppings
 * @param ham		Variable that set value of ham toppings
 */
	Pizza(String size,int cheese, int peproni, int ham){
		this.size_of_pizza=size;
		if(cheese > 0) this.number_of_cheese_topping=cheese;
		if(peproni > 0) this.number_of_pepperoni_topping=peproni;
		if(ham > 0) this.number_of_ham_topping=ham;
		
	}
	
	/**
	 * Blank Constructor to init the Pizza Object
	 */
	Pizza() {}
/**
 * Method that returns value of variable size_of_pizza
 * @return size_of_pizza
 */
	public String get_size(){
	return size_of_pizza;	
	}
/**
 * Method that returns value of variable number_of_cheese_topping
 * @return number_of_cheese_topping
 */
	public int get_cheese_topping(){
		return number_of_cheese_topping;
	}
/**
 * Method that returns value of variable number_of_pepperoni_topping
 * @return number_of_pepperoni_topping
 */
	public int get_pepperoni_topping(){
		return number_of_pepperoni_topping;
	}
/**
 * Method that returns value of variable number_of_ham_topping
 * @return number_of_ham_topping
 */
	public int get_ham_topping(){
		return number_of_ham_topping;
	}
/**
 * Method to set variable size_of_pizza
 * @param size
 */
	public void set_size(String size){
		this.size_of_pizza=size;	
	}
/**
 * Method to set variable number_of_cheese_topping
 * @param cheese
 */
	public void set_number_of_cheese_toppings(int cheese){
		if(cheese > 0) this.number_of_cheese_topping=cheese;
	}
/**
 * Method to set variable number_of_pepperoni_topping
 * @param peproni
 */
	public void set_number_of_peproni_toppings(int pepperoni){
		if(pepperoni > 0) this.number_of_pepperoni_topping=pepperoni;
	}
/**
 * Method to set variable number_of_ham_topping
 * @param ham
 */
	public void set_number_of_ham_toppings(int ham){
		if(ham > 0) this.number_of_ham_topping=ham;
	}
/**
 * Method that calculates price of pizza
 * @return total_cost
 */
	public double calCost(){
		int cost_of_size=0;
		String size=size_of_pizza;
		int number_of_topping=2*number_of_cheese_topping+2*number_of_pepperoni_topping+2*number_of_ham_topping;
		if(size.toLowerCase().equals("small")){
			cost_of_size=10;
		}
		if(size.toLowerCase().equals("medium")){
			cost_of_size=12;
		}
		if(size.toLowerCase().equals("large")){
			cost_of_size=14;
		}
		 
		double total_cost= cost_of_size +number_of_topping;
		return total_cost;
	}
/**
 * Returns string Description of pizza ordered
 * @return description
 */
	public String getDescription(){
		String description="A "+ size_of_pizza+" pizza with "+number_of_cheese_topping+
							" number of cheese toppings, "+ number_of_pepperoni_topping+
							" number of peproni toppings, "+number_of_ham_topping+
							" number of ham should cost $"+calCost();
		
		return description;
	}
	
}
