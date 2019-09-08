/*
 * Calories.java
 * 
 * Version : 1.0
 * 
 */

import java.util.Scanner;
/**
 * 
 * This class finds calories burned by
 * person in a day according to time spent
 *  doing activities
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */


public class Calories {
/**
 * Main function that finds Calories	
 * @param args
 */
public static void main( String[] args ){
	
	Double q=0.0, e=0.0, u=0.0, o=0.0, kgs=0.0;
	Scanner sc = new Scanner ( System.in );
	System.out.println( "Enter person weight in pounds: " );
	//value for input weight in pounds
	Double weight = sc.nextDouble();
	while( weight < 0 ){
		System.out.println( " Invalid input put proper Input:" );
		weight = sc.nextDouble();
	}
	 kgs = weight / 2.2; 
	//value that converts weight in kgs
	System.out.println( "Enter time person runs in minutes: " );
	Double run = sc.nextDouble();
	//value that stores minutes person run
	while( run < 0)
	{
		System.out.println( "Invalid Input, Enter correct input:" );
		run = sc.nextDouble();
	}
     q = run*12;
	//value for cex for run activity
	System.out.println( "Enter time person sleeps in minutes: " );
	Double sleep=sc.nextDouble();
	//value that stores minutes person sleep
	while( sleep < 0){
		System.out.println( "Invalid Input Enter proper input:" );
		sleep=sc.nextDouble();
	}
	 e = sleep * 1;
	 //value of cex for sleep activity
	
	System.out.println( "Enter time person play Soccer in minutes: " );
	Double soc = sc.nextDouble();
	//value that stores minutes person plays soccer
	while(soc<0){
		System.out.println("Invalid Input, Enter proper Input:");
		soc = sc.nextDouble();
	}
	 u = soc*10;
	 //value of cex for soccer activity
	
	System.out.println( "Enter time person swims in minutes: " );
	Double swim = sc.nextDouble();
	//value that stores in minutes person swims
	while( swim < 0 ){
		System.out.println( "Invalid Input , Enter proper Input: " );
		swim = sc.nextDouble();
	}
	 o = swim*14;
	 //value of cex for swim activity
	
	Double sum = q + e + u + o;
	//cex in total person perform activities
	
	Double calpermin = 0.0175 * sum * kgs;
	// calories of the person
	
	System.out.println( "IN TOTAL  CALORIES: " + calpermin );

}

}
