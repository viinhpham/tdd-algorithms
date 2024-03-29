package org.vinh.tdd;

import org.vinh.tdd.utils.Utils;

/**
 * Created by vinh.phamquoc on 8/28/20
 */
// A primeproduct is a positive integer that is the product of exactly two primes greater than 1
//. For example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
//Write a function named isPrimeProduct  with an integer parameter that returns 1 if the parameter is a primeproduct, otherwise it returns 0.
//Recall that a prime number is a positive integer with no factors other than 1 and itself.
//You may assume that there exists a function named isPrime(int m) that returns 1 if its m is a prime number.
// You do not need to write isPrime. You are allowed to use this function.
public class PrimeProduct {
	public int isPrimeProduct(int n){
		for (int i = 2; i <= n/2; i++) {
			if (Utils.isPrime(i) && n % i == 0 && Utils.isPrime(n/i)) {
				return 1;
			}
		}
		return 0;
	}
}
