package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/27/20
 */
public class BalancedArray {
// 3. A balanced array is defined to be an array where for every value n in the array, -n also is in the array.
//For example {-2, 3, 2, -3} is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not because 5 is not in the array.
//Write a function named isBalanced that returns 1 if its array argument is a balanced array. Otherwise it returns 0.
	public int isBalance(int [] array){
		int total = 0;
		for (int i : array) {
			total+=i;
		}
		return total == 0 ? 1 : 0;

	}
}
