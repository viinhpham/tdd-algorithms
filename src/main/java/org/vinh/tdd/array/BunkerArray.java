package org.vinh.tdd.array;

import org.vinh.tdd.utils.Utils;

/**
 * Created by vinh.phamquoc on 8/31/20
 */
public class BunkerArray {
//A Bunker array is defined to be an array in which at least one odd number is immediately followed by a prime number.
// So {4, 9, 6, 7, 3} is a Bunker array because the odd number 7 is immediately followed by the prime number 3.
// But {4, 9, 6, 15, 21} is not a Bunker array because none of the odd numbers are immediately followed by a prime number.
//Write a function named isBunkerArray that returns 1 if its array argument is a Bunker array, otherwise it returns 0.
public int isBunker(int[] array) {
	int length = array.length;
	if (length == 0) {
		return 0;
	}
	boolean isPrevOdd = array[0] % 2 != 0;
	for (int i = 1; i <  length; i++) {
		if (isPrevOdd && Utils.isPrime(array[i])) {
			return 1;
		}
		if (i % 2 != 0) {
			isPrevOdd = true;
		} else {
			isPrevOdd = false;
		}
	}
	return 0;
}
}
