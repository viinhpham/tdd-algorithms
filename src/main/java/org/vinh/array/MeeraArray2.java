package org.vinh.array;

import org.vinh.utils.Utils;

/**
 * @author vinh.phamquoc on 9/10/20
 */
public class MeeraArray2 {
//2. A Meera array is an array that contains the value 0 if and only if it contains a prime number.
// The array {7, 6, 0, 10, 1} is a Meera array because it contains a prime number (7) and also contains a 0.
// The array {6, 10, 1} is a Meera array because it contains no prime number and also contains no 0.
//The array {7, 6, 10} is not a Meera array because it contains a prime number (7) but does not contain a 0.
// The array {6, 10, 0} is not a Meera array because it contains a 0 but does not contain a prime number.
//It is okay if a Meera array contains more than one value 0 and more than one prime,
// so the array {3, 7, 0, 8, 0, 5} is a Meera array (3, 5 and 7 are the primes and there are two zeros.).
//Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0 otherwise.
//You may assume the existence of a function named isPrime that returns 1 if its argument is a prime and returns 0 otherwise.
// You do not have to write isPrime, you can just call it.
	public int isMeeraArray(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		boolean isZero = false;
		boolean isPrime = false;
		for (int i : array) {
			if (Utils.isPrime(i)) {
				isPrime = true;
			}
			if (i == 0) {
				isZero = true;
			}

		}
		return (isZero && isPrime) ||(!isZero && !isPrime) ? 1 : 0;
	}

}
