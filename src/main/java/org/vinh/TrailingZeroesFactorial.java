package org.vinh;

/**
 * Created by vinh.phamquoc on 9/5/20
 */
public class TrailingZeroesFactorial {
	//Given an integer n, write a function that returns count of trailing zeroes in n!.
//Examples :
//Input: n = 5
//Output: 1
//Factorial of 5 is 120 which has one trailing 0.
//Input: n = 20
//Output: 4
//Factorial of 20 is 2432902008176640000 which has
//4 trailing zeroes.
//Input: n = 100
//Output: 24
	public int countTrailingZeros(int n) {
//n = 5: There is one 5 and 3 2s in prime factors of 5! (2 * 2 * 2 * 3 * 5). So count of trailing 0s is 1.
//n = 11: There are two 5s and eight 2s in prime factors of 11! (2^8 * 3^4 * 5^2 * 7). So count of trailing 0s is 2.
		int count = 0;
		for (int i = 5; n / i >= 1; i *= 5) {

			count += n / i;
		}
		return count;
	}
}
