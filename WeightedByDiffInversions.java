/***
 * class finds the weighted inversions using modification in merge sort
 * 
 * @author jyotsna namdeo nakte jnn2078
 * @author Manali Chakraborty
 */

import java.util.Arrays;

import java.util.Scanner;

public class WeightedByDiffInversions {

	//Variable used calculate the final sum of the weighted inversions
	private long FINAL_SUM = 0;
/**
 * Method that merges and counts the weighted inversions
 	 * @param ar 			array to be sorted
	 * @param lowpoint		start of array
	 * @param midpoint		mid of the array
	 * @param highpoint		end of the array
 */
	public void merge(int ar[], int lowpoint, int midpoint, int highpoint) {
		//variable that stores value of weighted inversion
		long weighted_inversion = 0;
		//number of values in the left array and right array initialized
		int first_subarray = midpoint - lowpoint, second_subarray = highpoint - midpoint + 1;
		//array that stores left values of midpoint 
		int left[] = new int[first_subarray];
		//array that stores right values of midpoint
		int right1[] = new int[second_subarray];		
		int k = lowpoint, i = 0, j = 0;
		//loop that stores values in left array
		for (int m = 0; m < first_subarray; m++) {

			left[m] = ar[lowpoint + m];

		}
		//loop that stores values in right sub array
		for (int n = 0; n < second_subarray; n++) {

			right1[n] = ar[midpoint + n];

		}
		//variables that keeps track of previous elements in left array
		//inorder to find sum of weighted difference if it encounter smaller element in right when compared to left side
		long count_diff_left = 0;

		// Merging and Sorting two array in descending order while finding weighted difference

		while (i < first_subarray && j < second_subarray && left[i] != 0) {
			//if element in left is smaller than right
			if (left[i] < right1[j]) {
				//we update the right element in the array 
				ar[k] = right1[j];
				//updatej count
				j++;

				// Run until element in right array is larger than left

				while(i < first_subarray && j < second_subarray && left[i] != 0 && left[i] < right1[j]) {
					//counting the absolute value of difference i.e. subtracting from long difference
					//the current right element into number of indexes stored in long left difference
					weighted_inversion = weighted_inversion + Math.abs(count_diff_left - ((long)right1[j] * i));;
					//update k counter
					k++;
					//update element
					ar[k] = right1[j];
					//update j counter
					j++;
				}

			} else {
				//adding the left elements if greater in the array
				count_diff_left = left[i] + count_diff_left;
				//updating array
				ar[k] = left[i];
				
				i++;
				//counting the absolute value of difference with right elements smaller
				weighted_inversion = weighted_inversion + Math.abs(count_diff_left - ((long)right1[j] * i));;
				//loop till left elements greater than right elements
				while(i < first_subarray && j < second_subarray && left[i] != 0 && left[i] >= right1[j]) {
					//updating count difference left
					count_diff_left = left[i] + count_diff_left;
					//calculating weighted difference
					weighted_inversion = weighted_inversion + left[i] - right1[j];

					k++;

					ar[k] = left[i];

					i++;

				}

			}

			k++;

		}
		//condition for remaining right elements
		if (j < second_subarray) {
			//loop til it works with all elements
			while (j < second_subarray) {
				//condition to check last element
				if (j != second_subarray - 1) {
					//calculating long difference, weighted inversion
					long diff = count_diff_left - ((long)right1[j + 1] * i);

					weighted_inversion = weighted_inversion + diff;

				}

				ar[k] = right1[j];

				j++;

				k++;

			}

		}
		//condition for remaining left elements
		if (i < first_subarray) {
			//update array
			while (i < first_subarray) {

				ar[k] = left[i];

				i++;

				k++;

			}

		}

		//appending value to final sum
		FINAL_SUM += weighted_inversion;

	}

/***
  *Method that calculates the weighted inversions while modifying the merge sort 
  *algorithm
  *
  *  @param ar 			array to be sorted
  * @param lowpoint		start of array
  * @param highpoint	end of the array
* */
	public void counting_weighted_inversion_sum(int ar[], int lowpoint, int highpoint) {
		//base case if lowpoint is less than high
		if (lowpoint < highpoint) {
			//variable that finds the midpoint 
			int midpoint = (lowpoint + highpoint + 1) / 2;
			//recursive calls to the method to compute the left of midpoint
			counting_weighted_inversion_sum(ar, lowpoint, midpoint - 1);
			//recursive calls to the method to compute the from midpoint to end
			counting_weighted_inversion_sum(ar, midpoint, highpoint);
			//method call that is merging the above divided arrays while finding sum of weighted inversions
			merge(ar, lowpoint, midpoint, highpoint);
			

		}

	}

/**
 * Main Method that calls all the function
 * @param args
 */

	public static void main(String[] args) {
		//Object created of the class to call methods 
		WeightedByDiffInversions wd = new WeightedByDiffInversions();
		//Scanner class defined that helps to take input from command line
		Scanner sc = new Scanner(System.in);
		//number of integers as input
		int n = sc.nextInt();
		//array that stores the integers to find weighted inversion
		int numbers[] = new int[n];
		//loop that stores value in array from command line
		for (int i = 0; i < n; i++) {
			//command stores value 
			numbers[i] = sc.nextInt();
		}
		//calling the counted weight inversion method to calculated weighted inversion
		wd.counting_weighted_inversion_sum(numbers, 0, numbers.length - 1);
		//command that prints the Final Sum
		System.out.println(wd.FINAL_SUM);
	}
}