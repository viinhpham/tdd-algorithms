package org.vinh.tdd.array;

import org.vinh.tdd.utils.Utils;

/**
 * Created by vinh.phamquoc on 8/28/20
 */
public class CompleteArray {
	// . An array is defined to be complete if the conditions (a), (d) and (e) below hold.
	//   a. The array contains even numbers
	//   b. Let min be the smallest even number in the array.
	//   c. Let max be the largest even number in the array.
	//   d. min does not equal max
	//   e. All numbers between min and max are in the array
	//
	// For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because
	//   a. The array contains even numbers
	//   b. 2 is the smallest even number
	//   c. 8 is the largest even number
	//   d. 2 does not equal 8
	//   e. the numbers 3, 4, 5, 6, 7 are in the array.
	//
	// Examples of arrays that are not complete are:
	// {5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
	// {2, 2} condition (d) does not hold
	// {2, 6, 3, 4} condition (e) does not hold (5 is missing)
	public int isCompleteArray(int[] array) {
		boolean isEven = array[0] % 2 == 0;
		int smallest = array[0];
		int largest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				isEven = true;
				if (smallest > array[i]) {
					smallest = array[i];
				} else if (smallest % 2 != 0){
					smallest = array[i];
				}
				if (largest < array[i]) {
					largest = array[i];
				}else if (largest % 2 != 0) {
					largest = array[i];
				}
			}
		}
		boolean isBetweenSmallestLargest = true;
		for (int i = smallest + 1; i < largest; i++) {
			if (!Utils.isExists(i, array)) {
				isBetweenSmallestLargest = false;
				break;
			}
		}

		return isEven && smallest != largest && isBetweenSmallestLargest ? 1 : 0;

	}

}
