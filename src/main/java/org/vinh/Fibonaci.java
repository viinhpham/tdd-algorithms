package org.vinh;

/**
 * @author vinh.phamquoc on 9/9/20
 */
public class Fibonaci {
//A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,….
// Note that first two Fibonacci numbers are 1 and any Fibonacci number other than the first
// two is the sum of the previous two Fibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2
//and so on.Write a function named isFibonacci that returns 1 if its integer argument
//is a Fibonacci number, otherwise it returns 0.
//The signature of the function is
//int isFibonacci (int n)
	public int isFibonacci (int n){
		int a = 1, b = 1, c = 0;
		while (c < n) {
			c = a + b;
			a = b;
			b = c;
		}
		return c == n ? 1 : 0;
	}
}
