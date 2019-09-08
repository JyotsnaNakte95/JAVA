/*
 * PizzaOrder_Test.java
 */
/**
 * 
 * This class tests the PizzaOrder class that calculates price
 * according to input given.  
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */

public class PizzaOrder_Test {
/**
 * Main function that gives input to PizzaOrder class for calculating price
 * various test cases
 * @param args
 */
	public static void main(String[] args){
		Pizza p1 = new Pizza("large",1,0,1);
		p1.calCost();
		System.out.println(p1.getDescription());
		
		Pizza p2 = new Pizza("medium",2,2,0);
		System.out.println(p2.getDescription());
		PizzaOrder po = new PizzaOrder();
		po.setNumPizzas(2);
		po.setPizza1(p1);
		po.setPizza2(p2);
		System.out.println("Price of Order of Two Pizzas: $" + po.calcTotal());
		
		PizzaOrder po2 = new PizzaOrder(po);
		
		po2.getPizza1().set_number_of_cheese_toppings(3);
		System.out.println("Price of Order with cheese toppings changed: $"+po2.calcTotal());
		System.out.println("Price of Previous Order: $"+po.calcTotal());
	}
}
