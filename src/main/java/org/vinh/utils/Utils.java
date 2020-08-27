package org.vinh.utils;

/**
 * Created by vinh.phamquoc on 8/22/20
 */
public class Utils {
	public static int sumArray(int[]array) {
		int total = 0;
		for(int j : array) {
			total+=j;
		}
		return total;
	}
	public static int sumArrayRange(int[]array, int start, int end) {
		int total = 0;
		for(int i = start; i <= end ; i++) {
			total += array[i];
		}
		return total;
	}
	public static boolean isPrime(int number) {
		if (number <= 0) {
			return false;
		}
		boolean isPrime = true;
		for (int divider = 2; divider <= number/2; divider++) {
			if (number % divider == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
