/*
 * Grading.java
 * Version 1
 */
import java.util.Scanner;
/**
 * 
 * This class finds grades fofr particular scores of student
 * 
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */

public class Grading {
	float q1;
	/**
	 * 
	 * @param sum
	 * @return
	 */
	public static float Quiz_calc( float sum ){
		float q_grade = sum/40 ;
		float q_percentage = 25 * q_grade ;
		System.out.println( "Quiz percentage :" + q_percentage + "%" );
		return q_percentage;
	}
	/**
	 * 
	 * @param sum
	 * @return
	 */
	public static float Midterm_calc( float sum ){
	float m_grade = sum/100 ;
	float m_percentage = 35 * m_grade ;
	System.out.println( "Midterm percentage :" + m_percentage + "%" );
	return m_percentage;

	}
	/**
	 * 
	 * @param finel
	 * @return
	 */
	public static float Final_calc( float finel ){
	float f_grade = finel/100 ;
	float f_percentage = 40 * f_grade ;
	System.out.println( "Midterm percentage :" + f_percentage + "%" );
	return f_percentage;	
	}
	/**
	 * 
	 * @param total
	 */
	public static void Grade_calc( float total ){
	if( total > 90 ){
		System.out.println( "Grade Obtained is A" );
	if( total > 80 && total < 90 ){
			System.out.println( "Grade Obtained is B" );	
		}
	if( total > 70 && total < 80 ){
		System.out.println( "Grade Obtained is C" );	
	}
	if( total > 60 && total < 70 ){
		System.out.println( "Grade Obtained is D" );	
	}
	if( total < 60 ){
		System.out.println( "Failed the Course" );	
	}
	}
}
	/**
	 * 
	 * @param args
	 */
	public static void main( String[] args ){
	Scanner sc = new Scanner( System.in );
	
	System.out.println( "Enter marks for quiz 1 :" );
	float q1 = sc.nextFloat();
	System.out.println( "Enter marks for quiz 2 :" );
	float q2 = sc.nextFloat();
	System.out.println( "Enter marks for quiz 3 :" );
	float q3 = sc.nextFloat();
	System.out.println( "Enter marks for quiz 4 :" );
	float q4 = sc.nextFloat();
	float quizess = q1 + q2 + q3 +q4 ;
	System.out.println( "Enter marks for Midterm 1 :" );
	float m1 = sc.nextFloat();
	System.out.println( "Enter marks for Midterm 2 :" );
	float m2 = sc.nextFloat();
	float mids = m1+m2;
	System.out.println( "Enter marks for Final Exam :" );
	float f1 = sc.nextFloat();
	float total = Quiz_calc(quizess) + Midterm_calc(mids) + Final_calc(f1) ;
	System.out.println( "Total Percentage Obtained : " + total + "%" );
	Grade_calc( total );
	
	}
}
