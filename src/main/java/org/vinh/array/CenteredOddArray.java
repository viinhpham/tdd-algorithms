package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/29/20
 */
//3. An array with an odd number of elements is said to be centered if
//all elements   (except the middle one) are strictly greater than the value of the middle element.
//Note that only arrays with an odd number of elements have a middle element.
// Write a function named isCentered that accepts an integer array
//and returns 1 if it is a centered array, otherwise it returns 0.
//Examples: {5, 3, 3, 4, 5} is not a centered array (the middle element 3 is not strictly less than all other elements),
// {3, 2, 1, 4, 5} is centered (the middle element 1 is strictly less than all other elements),
// {3, 2, 1, 4, 1} is not centered (the middle element 1 is not strictly less than all other elements),
// {3, 2, 1, 1, 4, 6} is not centered (no middle element since array has even number of elements),
// {} is not centered (no middle element), {1} is centered (satisfies the condition vacuously).
public class CenteredOddArray {
	public int isCenteredOdd(int[] array) {
		int length = array.length;
		if (length == 0 || length % 2 == 0) {
			return 0;
		}
		int i = 0, j = length - 1;
		while (i < j) {
			if (array[i] <= array[length/2] || array[j] <= array[length/2]) {
				return 0;
			}
			i++;
			j--;
		}
		return 1;
	}
}
