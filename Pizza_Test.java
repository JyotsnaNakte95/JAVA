/*
 * Pizza_Test.java
 */
/**
 * 
 * This class tests the pizza class that calculates price
 * according to input given.  
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */

public class Pizza_Test {
/**
 * Main function that gives input to Pizza class for calculating price
 * various test cases
 * @param args
 */
	public static void main(String[] args){
		Pizza p1 = new Pizza("large",1,0,1);
		System.out.println(p1.getDescription());
		
		p1 = new Pizza("small",1,2,2);
		System.out.println(p1.getDescription());
		
		p1 = new Pizza("medium",1,1,1);
		System.out.println(p1.getDescription());
		
		p1 = new Pizza("large",0,0,0);
		System.out.println(p1.getDescription());
		
		p1 = new Pizza("small",1,0,0);
		System.out.println(p1.getDescription());
/**
 * Test case if negative input by mistake by the dealer		
 */
		p1 = new Pizza("small",1,0,-1);
		System.out.println(p1.getDescription());
		
	}
}
