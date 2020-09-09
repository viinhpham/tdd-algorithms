package org.vinh.array;

import org.vinh.utils.Utils;

/**
 * @author vinh.phamquoc on 9/9/20
 */
public class NiceArray3{
/// An array is defined to be a Nice array if the sum of the primes
//in the array is equal to the first element of the array. If there
//are no primes in the array, the first element must be 0. So
//{21, 3, 7, 9, 11 4, 6} is a Nice array because 3, 7, 11 are the primes in the array
//and they sum to 21 which is the first element of the array.
//{13, 4, 4,4, 4} is also a Nice array because the sum of the primes is 13 which is also the first element.
// Other Nice arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}.
//{8, 5, -5, 5, 3} is not a Nice array because the sum of the primes is 5+5+3 = 13
//but the first element of the array is 8. Note that -5 is not a prime because prime numbers are positive.
//Write a function named isNiceArray that returns 1 if its integer array argument is a Nice array.
// Otherwise it returns 0.
	public int isNiceArray(int [] array){
		int length = array.length;
		if (length == 0) {
			return 0;
		}
		int primeSum = 0;
		for (int i : array) {
			if (Utils.isPrime(i)) {
				primeSum+=i;
			}
		}
		return primeSum == array[0] ? 1 : 0;
	}
}
