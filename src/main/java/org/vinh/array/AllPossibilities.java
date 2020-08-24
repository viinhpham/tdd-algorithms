package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/24/20
 */
//A non-empty array of length n is called an array of all possibilities,
//if it contains all numbers between 0 and n - 1 inclusive. Write a method named isAllPossibilities
//that accepts an integer array and returns 1 if the array is an array of all possibilities, otherwise it returns 0.
//Examples {1, 2, 0, 3} is an array of all possibilities, {3, 2, 1, 0} is an array of all possibilities,
//{1, 2, 4, 3} is not an array of all possibilities, (because 0 not included and 4 is too big), {0, 2, 3} is not an array of all possibilities,
//(because 1 is not included), {0} is an array of all possibilities, {} is not an array of all possibilities (because array is empty).
public class AllPossibilities {
	public int isAllPossibilities(int[] array) {
		int n = array.length;
		if (n == 0) {
			return 0;
		}
		for (int i = 0; i < n; i++) {
			//to track if there is more than 1 i element in input array
			int count = 0;
			for (int j : array) {
				if (i == j) {
					count++;
				}
			}

			if (count == 0 || count > 1) {
				return 0;
			}
		}
		return 1;
	}
}
