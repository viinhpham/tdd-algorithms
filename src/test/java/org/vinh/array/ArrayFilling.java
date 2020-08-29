package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/29/20
 */
public class ArrayFilling {
/* Write a function fill with signature int[ ] fill(int[ ] arr, int k, int n)
which does the following: It returns an integer array arr2 of length n whose first k elements are
the same as the first k elements of arr, and whose remaining elements consist of repeating blocks of the first k elements.
You can assume array arr has at least k elements. The function should return null if either k or n is not positive.
Examples:
fill({1,2,3,5, 9, 12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}.
fill({4, 2, -3, 12}, 1, 5)  returns {4, 4, 4, 4, 4}.
fill({2, 6, 9, 0, -3}, 0, 4) returns null.*/

	public int[] fill(int[] array, int k, int n) {
		if (k <= 0 || n <= 0) {
			return null;
		}
		int[] result = new int[n];
		//track to recall the first k element of input array
		int track = 0;
		for (int i = 0; i < n; i++) {
			result[i] = array[track];
			track++;
			// reset for writing new block of k element
			if (track == k) {
				track = 0;
			}
		}
		return result;
	}
}
