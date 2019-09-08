/**
 * PrimeMultiThreading.java
 */
import java.util.*;
/**
 * This Class use the multi-threading to find prime number between 1 - 100
 * @author Jyotsna Nakte
 *
 */
public class PrimeMultiThreading extends Thread {
	
	static boolean[] potentialPrime = new boolean[101];
	int multiplicationFactor;
	
	/*
	 * Constructor to set the multiplication factor of the thread
	 */
	public PrimeMultiThreading(int multiplicationFactor) {
		this.multiplicationFactor = multiplicationFactor;
	}
	
	/*
	 * Method that executes when Thread starts
	 * Setting the Potential Prime multiplication false
	 */
	public void run() {
		for(int i = multiplicationFactor * multiplicationFactor; i <= 100; i += multiplicationFactor) {
			potentialPrime[i] = false;
		}
	}
	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	
	public static void main(String args[]) throws InterruptedException {
		// Populating the Prime Boolean to True
		Arrays.fill(potentialPrime, Boolean.TRUE);
		Thread[] thread = new PrimeMultiThreading[100];
		int Threadcount = 0;
		for(int i = 2; i <= 10; i++) {
			// If Prime found then start the thread and set the multiplication factor to false
			if(potentialPrime[i] == true) {
				thread[Threadcount] = new PrimeMultiThreading(i);
				thread[Threadcount].start();
				Threadcount += 1;
			}
		}
		// Wait for all the Thread to Join
		for(int j = 0; j < Threadcount; j++) {
			thread[j].join();
		}
		// Print the Thread
		for(int j = 1; j <= 100; j++) {
			if(potentialPrime[j] == true) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
	}
}
