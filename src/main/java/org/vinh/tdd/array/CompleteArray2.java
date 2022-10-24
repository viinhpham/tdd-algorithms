package org.vinh.tdd.array;

import org.vinh.tdd.utils.Utils;

/**
 * Created by vinh.phamquoc on 9/6/20
 */
public class CompleteArray2 {
//3. An array is defined to be complete if all its elements are greater than 0 and all even numbers that are less than the maximum even number are in the array.

//For example {2, 3, 2, 4, 11, 6, 10, 9, 8} is complete because
//  a. all its elements are greater than 0
//  b. the maximum even integer is 10
//  c. all even numbers that are less than 10 (2, 4, 6, 8) are in the array.

//But {2, 3, 3, 6} is not complete because the even number 4 is missing. {2, -3, 4, 3, 6} is not complete because it contains a negative number.

//Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise it returns 0.
	public int isComplete(int[] array) {
		int length = array.length;
		if (length == 0) {
			return 0;
		}
		int max = 0;
		for (int i : array) {
			//a condition
			if (i < 0) {
				return 0;
			}
			if (i % 2 == 0 && i > max) {
				max = i;
			}
		}
		//b condtion
		if (max != 10) {
			return 0;
		}
		//c condition
		for (int i = 1; i < max; i++) {
			if (i % 2 == 0 && !Utils.isExists(i, array)) {
				return 0;
			}
		}
		return 1;
	}
}
