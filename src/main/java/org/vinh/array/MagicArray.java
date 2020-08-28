package org.vinh.array;

import org.vinh.utils.Utils;

/**
 * Created by vinh.phamquoc on 8/28/20
 */
public class MagicArray {
//An array is defined to be a Magic array if the sum of the primes in the array is equal to the first element of the array.
//If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9, 11 4, 6}
//is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 which is the first element of the array.
//{13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13 which is also the first element. Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}.
//{8, 5, -5, 5, 3} is not a Magic array because the sum of the primes is 5+5+3 = 13. Note that -5 is not a prime because prime numbers are positive.
public int isMagicArray(int [] array) {
	int total = 0;
	if (array.length == 0) {
		return 0;
	}

	for (int i : array) {
		if (Utils.isPrime(i)) {
			total+=i;
		}
	}
	return total == array[0] || (total == 0 && array[0] == 0) ? 1 : 0;
}
}
