package org.vinh.prime;

/**
 * Created by vinh.phamquoc on 12/30/19
 */
public class PrimeCheck {
	public int primeCount(int start, int end) {
		int primeCount = 0;
		for (int number = start; number <= end; number++) {
			if (number == 2) {
				primeCount++;
				continue;
			}
			if (number > 1 && number % 2 != 0) {
				if (isPrime(number)) {
					primeCount++;
				}
			}
		}
		return primeCount;
	}

	private boolean isPrime(int number) {
		boolean isPrime = true;
		for (int divider = 2; divider * 2 <= number; divider++) {
			if (number % divider == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
