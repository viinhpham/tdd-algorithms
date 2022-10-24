package org.vinh.tdd.array;

/**
 * Created by vinh.phamquoc on 6/9/20
 */
public class SquareOrderedArray {
	//using two pointers & dynamic programming approach
	int[] squareOrderedArray(int [] array) {
		int start = 0,
				end = array.length - 1;
		int[] result = new int[array.length];
		while (start < end) {
			int power1, power2 = 0;
			if (result[start] > 0){
				power1 = result[start];
			} else {
				power1 = array[start] * array[start];
			}

			if (result[end] > 0){
				power1 = result[end];
			} else {
				power2 = array[end] * array[end];
			}

			if (power1 > power2) {
				result[end] = power1;
				result[start] = power2;
			} else {
				result[start] = power1;
				result[end] = power2;
			}
			end--;
		}
		return result;
	}
}
