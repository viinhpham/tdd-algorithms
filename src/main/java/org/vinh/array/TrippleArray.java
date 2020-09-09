package org.vinh.array;

/**
 * @author vinh.phamquoc on 9/9/20
 */
public class TrippleArray {
//. Define a Triple array to be an array where every value occurs exactly three times.

//For example, {3, 1, 2, 1, 3, 1, 3, 2, 2} is a Triple array.

//The following arrays are not Triple arrays
//{2, 5, 2, 5, 5, 2, 5} (5 occurs four times instead of three times)
//{3, 1, 1, 1} (3 occurs once instead of three times)

//Write a function named isTriple that returns 1 if its array argument is a Triple array. Otherwise it returns 0.

	//If you are programming in Java or C#, the function signature is
//int isTriple (int[ ] a)
	public int isTriple(int[] array) {
		int length = array.length;
		if (length % 3 != 0) {
			return 0;
		}
		int count;
		for (int i : array) {
			count = 0;
			for (int j : array) {
				if (i == j) {
					count++;
				}
			}
			if (count != 3) {
				return 0;
			}
		}
		return 1;

	}
}
