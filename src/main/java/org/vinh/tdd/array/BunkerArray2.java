package org.vinh.tdd.array;

import org.vinh.tdd.utils.Utils;

/**
 * Created by vinh.phamquoc on 9/2/20
 */
public class BunkerArray2 {
	//A Bunker array is an array that contains the value 1 if and only if it contains a prime number.
//The array {7, 6, 10, 1} is a Bunker array because it contains a prime number (7) and also contains a 1.
//The array {7, 6, 10} is not a Bunker array because it contains a prime number (7) but does not contain a 1.
// The array {6, 10, 1} is not a Bunker array because it contains a 1 but does not contain a prime number.
//It is okay if a Bunker array contains more than one value 1 and more than one prime,
// so the array {3, 7, 1, 8, 1} is a Bunker array (3 and 7 are the primes).

	public int isBunkerArray(int[] array) {
		boolean hasOne = false, isPrime = false;
		for (int i : array) {
			if (i == 1) {
				hasOne = true;
			}

			if (Utils.isPrime(i)) {
				isPrime = true;
			}
			if (hasOne && isPrime) {
				return 1;
			}
		}
		return hasOne && isPrime ? 1 : 0;
	}
}
