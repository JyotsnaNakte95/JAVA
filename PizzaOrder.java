/*
 * PizzaOrder.java
 */
/**
 * PizzaOrder extends from Pizza class
 * This class calculates price of number of three pizza  orders
 * according to size and number of toppings 
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */

public class PizzaOrder extends Pizza {
/**
 * pizza1	Instance private variable of order 1
 * pizza2	Instance private variable of order 2
 * pizza3	Instance private variable of order 3
 */
	private Pizza pizza1 = null;
	private Pizza pizza2 = null;
	private Pizza pizza3 = null;
	private int numberOfPizza = 0;
/**
 * Constructor that sets order of three pizzas or null if less than three orders	
 * @param pO
 */
	public PizzaOrder(PizzaOrder pO) {
		
		if(pO.getPizza1() != null)
			this.pizza1 = new Pizza(pO.getPizza1().get_size(),
					      pO.getPizza1().get_cheese_topping(),
					      pO.getPizza1().get_pepperoni_topping(),
					      pO.getPizza1().get_ham_topping());
		if(pO.getPizza2() != null)
			this.pizza2 = new Pizza(pO.getPizza2().get_size(), 
					      pO.getPizza2().get_cheese_topping(), 
					      pO.getPizza2().get_pepperoni_topping(), 
					      pO.getPizza2().get_ham_topping());
		if(pO.pizza3 != null)
			this.pizza3 = new Pizza(pO.getPizza3().get_size(),
					      pO.getPizza3().get_cheese_topping(),
					      pO.getPizza3().get_pepperoni_topping(),
					      pO.getPizza3().get_ham_topping());
		this.numberOfPizza = pO.getNumPizzas();
	}
/**
 * Method that calculates price of all orders of pizzas
 * @return
 */
	public double calcTotal() {
		double p1 = 0, p2 = 0, p3 = 0;
		if(pizza1 != null) p1 = pizza1.calCost();
		if(pizza2 != null) p2 = pizza2.calCost();
		if(pizza3 != null) p3 = pizza3.calCost();
		
		return p1 + p2 + p3;
	}
/**
 * Empty constructor of class	
 */
	public PizzaOrder() {}
/**
 * 	Method that returns value of variable numberOfPizza Orders
 * @return numberOfPizza
 */
	public int getNumPizzas() {
		return numberOfPizza;
	}
/**
 * Method that returns value of variable pizza1
 * @return pizza1
 */
	public Pizza getPizza1() {
		return pizza1;
	}
/**
 * Method that returns value of variable pizza2
 * @return pizza2
 */
	public Pizza getPizza2() {
		return pizza2;
	}
/**
 * Method that returns value of variable pizza3
 * @return pizza3
 */
	public Pizza getPizza3() {
		return pizza3;
	}
/**
 * Method to set variable value of numberOfPizza
 * @param numberOfPizza
 */
	public void setNumPizzas(int numberOfPizza) {
		this.numberOfPizza = numberOfPizza;
	}
/**
 * Method to set variable value of pizza1
 * @param pizza1
 */
	public void setPizza1(Pizza pizza1) {
		this.pizza1 = pizza1;
	}
/**
 *  Method to set variable value of pizza2
 * @param pizza2
 */
	public void setPizza2(Pizza pizza2) {
		this.pizza2 = pizza2;
	}
/**
 *  Method to set variable value of pizza3
 * @param pizza3
 */
	public void setPizza3(Pizza pizza3) {
		this.pizza3 = pizza3;
	}
}
