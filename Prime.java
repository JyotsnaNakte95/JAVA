/*
 * Prime.java
 * 
 * Version : 1.0
 * 
 */

import java.util.Scanner;
/**
 * 
 * This class finds upto n prime numbers
 * 
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */



public class Prime {
/**
 * Function find n prime numbers
 * @param n value upto to find prime numbers
 */
	

public static void find( int n ){
	int count = 0;
	if( n<2 ){
		System.out.println( "No prime numbers" );
	}
	else{
//loop that checks if number prime or not		
		for( int i=2;i<n;i++ ){
			for( int j=2;j<i;j++ ){
				if( i%j==0 )
				{	
					count = 1;
					break;
				}
			}
			if( count == 0 ) {
				System.out.println( i );
			}
			count = 0;
		}
	}
}

/**
 * Main function that calls function to find prime numbers
 * @param args
 */


public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n:");
	int n = sc.nextInt();
	System.out.println("Prime numbers are :");
	find(n);
	
        
}
}
