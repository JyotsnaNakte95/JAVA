/*
 * Palindromes.java
 * 
 * Version : 1.0
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * This class finds whether string is palindrome or not
 * 
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */


public class Palindromes {
/**
 * Function that finds if string is palidrome or not	
 * @param s1   value that takes string as input
 * @return
 */
	public boolean pali( String s1 ){
		
		String r = s1.substring( 0, s1.length()/2 ).toLowerCase();
		//System.out.println(r);
		String v = new StringBuffer( s1 ).reverse().toString();
		String u = v.substring( 0, s1.length()/2 ).toLowerCase();
		//System.out.println(u);
		if( r.equals(u) )	
		{
			System.out.println( "It is palindrome" );
			return true;
		}
		else
		{
			System.out.println( "It is not a palindrome" );	
			return false;
		}
	}
/**
 * Main function that calls the function pali
 * @param args
 */
public static void main(String[] args){
	Palindromes p = new Palindromes();
	//System.out.println("true");
	Scanner sc = new Scanner( System.in );
	System.out.println( "Enter string to be checked:" );
	String word = sc.next();
	//input from user
	System.out.println( p.pali( word ) );
}
}
