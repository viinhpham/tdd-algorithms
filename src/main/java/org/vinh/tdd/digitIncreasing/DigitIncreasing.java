package org.vinh.tdd.digitIncreasing;

/**
 * Created by vinh.phamquoc on 2/13/20
 */
public class DigitIncreasing {
	boolean isDigitIncreasing(int n) {
		if (n <= 9) {
			return true;
		}
		//36 = 3 + 33
		int sum;
		int i = 1;
		int count = 1;
		sum = i;
		int previousNumber = i;
		while (sum < n && i <= 9) {
			int current = count * 10 * i + previousNumber;
			sum += current;
			previousNumber = current;
			count *= 10;

			if (sum == n) {
				return true;
			}
			if (sum > n) {
				count = 1;
				i++;
				previousNumber = i;
				sum = i;
			}

		}
		return false;
	}
}
