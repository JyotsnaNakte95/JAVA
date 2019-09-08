/*
 * Sum.java
 * 
 * Version : 1.0
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * This class gets the input from user and then
 * calculates the sum of the given input.
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */


public class Sum {
/**
 * Function to find Sum
 * @param   n   input from user  
 * @return sum  returns value after calculation
 */
	public int sum ( int n ){
		int sum = 0, firstdigit = 0;
		int temp = n;
		//value to store sum
		//loop to find sum
		while ( n != 0 ){
			int v = n % 10;
			//value used to add numbers one by one
			firstdigit = v;
			sum = sum + v;
			n = n / 10;
	}
		//condition if contains negative value
		if( temp < 0 ) {
			sum -= ( 2 * firstdigit );
			sum = -sum;
		}
	return sum;
	}
/**
 * Main function that calls the function sum
 * @param args
 */
public static void main( String[] args ){
	Sum ss = new Sum();
	Scanner sc = new Scanner( System.in );
	System.out.println( "Enter the number to be calculated:" );
	String c = sc.next();
	//condition if float value
	if( c.contains( "." ) ) {
		c = c.replace( ".", "" );
	}
	int a = Integer.parseInt(c);
	//value that takes input from user
	System.out.println( "Calculated value of the integer:"+ ss.sum(a) );
		}

}
