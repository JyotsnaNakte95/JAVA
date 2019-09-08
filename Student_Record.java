/*
 * Student_Record.java
 */
import java.util.Scanner;
/**
 * 
 * This class calculates overall score and grade of students 
 * 
 * 
 * @author Jyotsna Namdeo Nakte
 *
 */


public class Student_Record {
/**
 * Quiz_1			Instance variable to store marks of Quiz 1
 * Quiz_2			Instance variable to store marks of Quiz 2
 * Quiz_3			Instance variable to store marks of Quiz 3
 * Quiz_4			Instance variable to store marks of Quiz 4
 * Midterm_1		Instance variable to store marks of Midterm 1
 * Midterm_2		Instance variable to store marks of Midterm 2
 * Final_paper		Instance variable to store marks of Final Paper
 * Overall_Score	Instance variable to store overall score
 * Final_grade		Instance variable to store Final Grade Scored
 */
	float Quiz_1,Quiz_2,Quiz_3, Quiz_4;
	float Midterm_1,Midterm_2;
	float Final_paper;
	float Overall_Score;
	char Final_grade;
/**
 * Method to set variable Quiz_1
 * @param q1
 */
	public void set_Quiz_1(float q1){
		this.Quiz_1 = q1;
	}
/**
 * 	Method to set variable Quiz_2
 * @param q2
 */
	public void set_Quiz_2(float q2){
	    this.Quiz_2 = q2;
	}
/***
 * Method to set variable Quiz_3
 * @param q3
 */
	public void set_Quiz_3(float q3){
	    this.Quiz_3 = q3;
	}
/**
 * Method to set variable Quiz_4
 * @param q4
 */
	public void set_Quiz_4(float q4){
	    this.Quiz_4 = q4;
	}
/**
 * Method to set variable Midterm_1
 * @param m1
 */
		public void set_Midterm_1(float m1){
	    this.Midterm_1=m1;
	}
/**
 * Method to set variable Midterm_2
 * @param m2
 */
	public void set_Midterm_2(float m2){
	    this.Midterm_2=m2;
	}
/**
 * Method to set variable Overall_Score
 * @param oS
 */
	public void set_Overall_Score(float oS){
	    this.Overall_Score=oS;
	}
/**
 * Method to set variable Final_Grade
 * @param grade
 */
	public void set_Grade(char grade){
	    this.Final_grade=grade;
	}
/**
 * Method to set variable Final_paper
 * @param f1
 */
	public void set_Final_paper_1(float f1){
	    this.Final_paper=f1;
	}
/**
 * 	Method that returns value of variable Overall_Score
 * @return
 */
	public float get_Overall_Score(){
	    return Overall_Score;
	}
/**
 * Method that returns value of variable Final_Grade
 * @return
 */
	public char get_Grade(){
	    return Final_grade;
	}
/**
 * Method that returns value of variable Quiz_1
 * @return
 */
	public float get_Quiz_1(){
		return Quiz_1;
	}
/**
 *  Method that returns value of  variable Quiz_2
 * @return
 */
	public float get_Quiz_2(){
		return Quiz_2;
	}
/**
 *  Method that returns value of variable Quiz_3
 * @return
 */
	public float get_Quiz_3(){
		return Quiz_3;
	}
/**
 *  Method that returns value of variable Quiz_4
 * @return
 */
	public float get_Quiz_4(){
		return Quiz_4;
	}
/**
 *  Method that returns value of variable Midterm_1
 * @return
 */
	public float get_Midterm_1(){
		return Midterm_1;
	}
/**
 *  Method that returns value of variable Midterm_2
 * @return
 */
	public float get_Midterm_2(){
		return Midterm_2;
	}
/**
 *  Method that returns value of variable Final_paper
 * @return
 */
	public float get_Final_paper_1(){
		return Final_paper;
	}
/**
 * Method that calculates average percentage of Quizzes
 * @return	Quiz percentage
 */

	private float Quiz_calc(){
		float q_grade = get_Quiz_1()+ get_Quiz_2() + get_Quiz_3() + get_Quiz_4() ;
		float q_percentage = 25 * (q_grade/40) ;
		return q_percentage;
	}
/**
 * Method that calculates average percentage of Midterm
 * Assumption two midterms of 50 marks each 
 * they are out of 100 marks calculated.
 * @return m_percentage
 */
	private float Midterm_calc( ){
	float m_grade = get_Midterm_1()+ get_Midterm_2() ;
	float m_percentage = 35 * (m_grade/100) ;
	return m_percentage;
	
	}
/**
 * 
 * Method that calculates average percentage of Final paper
 * @return
 */
	private float Final_calc(  ){
	float f_grade = get_Final_paper_1()/100 ;
	float f_percentage = 40 * f_grade ;
	return f_percentage;	
	}
/**
 * Method that calculates Final Grade
 */
	public void calculate_final_Result(){
		this.set_Overall_Score(Final_calc() + Midterm_calc()+ Quiz_calc());
		if( this.equals(90)){
			this.set_Grade('A');
		}
		else if( this.equals(80) ){
			this.set_Grade('B');
		}
		else if( this.equals(70) ){
			this.set_Grade('C');
		}
		else if( this.equals(60) ){
			this.set_Grade('D');
		}
		else {
			this.set_Grade('F');
		}
	}
/**
 * Method that returns result as String 
 */
	public String toString(){
		String result = "\nStudent grades accordingly \nQuiz_1: " +get_Quiz_1()+ "\nQuiz_2: "
				+ get_Quiz_2() + "\nQuiz_3: "+ get_Quiz_3() + 
				"\nQuiz_4: " + get_Quiz_4() + "\nMidterm_1: " + get_Midterm_1() + 
				"\nMidterm_2: " + get_Midterm_2() + "\nFinal_Paper: "+ get_Final_paper_1() + 
				"\nTotal Percentage Scored: " + get_Overall_Score() +" %"+ "\nGrade: " + get_Grade();
		return result;
	}
/**
 * Method equals that checks if Overall Score is not negative
 * @param 
 * @return
 */
	public boolean equals(float o) {
		return this.Overall_Score >= o;    
	}
/**
 * Main function that takes value of Quizzes, Midterm, Final Paper as input
 * and that sets Instance variable values , calculates the Overall Score with 
 * Final Grade
 * @param args
 */

public static void main( String[] args ){
	Student_Record sr = new Student_Record();
	Scanner sc = new Scanner( System.in );
	System.out.println( "Enter marks for quiz 1 :" );
	float q1 = sc.nextFloat();
	sr.set_Quiz_1(q1);
	while(q1 < 0 || q1 > 10) {
		System.out.println("Enter Proper Marks");
		q1 = sc.nextFloat();
		sr.set_Quiz_1(q1);
	}
	
	System.out.println( "Enter marks for quiz 2 :" );
	float q2 = sc.nextFloat();
	sr.set_Quiz_2(q2);
	while(q2 < 0 || q2 > 10) {
		System.out.println("Enter Proper Marks");
		q2 = sc.nextFloat();
		sr.set_Quiz_2(q2);
	}
	
	System.out.println( "Enter marks for quiz 3 :" );
	float q3 = sc.nextFloat();
	sr.set_Quiz_3(q3);
	while(q3 < 0 || q3 > 10) {
		System.out.println("Enter Proper Marks");
		q3 = sc.nextFloat();
		sr.set_Quiz_3(q3);
	}
	
	System.out.println( "Enter marks for quiz 4 :" );
	float q4 = sc.nextFloat();
	sr.set_Quiz_4(q4);
	while(q4 < 0 || q4 > 10) {
		System.out.println("Enter Proper Marks");
		q4 = sc.nextFloat();
		sr.set_Quiz_4(q4);
	}
	
	System.out.println( "Enter marks for Midterm 1 :" );
	float m1 = sc.nextFloat();
	sr.set_Midterm_1(m1);
	while(m1 < 0 || m1 > 50) {
		System.out.println("Enter Proper Marks");
		m1 = sc.nextFloat();
		sr.set_Midterm_1(m1);
	}
	
	System.out.println( "Enter marks for Midterm 2 :" );
	float m2 = sc.nextFloat();
	sr.set_Midterm_2(m2);
	while(m2 < 0 || m2 > 50) {
		System.out.println("Enter Proper Marks");
		m2 = sc.nextFloat();
		sr.set_Midterm_2(m2);
	}
	
	System.out.println( "Enter marks for Final Exam :" );
	float f1 = sc.nextFloat();
	sr.set_Final_paper_1(f1);
	while(f1 < 0 || f1 > 100) {
		System.out.println("Enter Proper Marks");
		f1 = sc.nextFloat();
		sr.set_Final_paper_1(f1);
	}
	
	sr.calculate_final_Result();
	System.out.println(sr.toString());
	sc.close();


}
}