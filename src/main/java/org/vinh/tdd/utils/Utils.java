package org.vinh.tdd.utils;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by vinh.phamquoc on 8/22/20
 */
public class Utils {
	public static int sumArray(int[] array) {
		return Arrays.stream(array).sum();
//		int total = 0;
//		for(int j : array) {
//			total+=j;
//		}
//		return total;
	}

	public static int sumArrayRange(int[] array, int start, int end) {
		return Arrays.stream(array).skip(start).limit(end - start + 1).sum();
//		or return IntStream.range(start, end + 1).map(i -> array[i]).sum();
//		or
//		int total = 0;
//		for(int i = start; i <= end ; i++) {
//			total += array[i];
//		}
//		return total;
	}

	public static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}
		boolean isPrime = true;
		for (int divider = 2; divider <= number / 2; divider++) {
			if (number % divider == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static boolean isExists(int i, int[] array) {
		return Arrays.stream(array).anyMatch(j -> j == i);
//		boolean result = false;
//		for (int j : array){
//			if (j == i) {
//				return true;
//			}
//		}
//		return result;
	}
}
