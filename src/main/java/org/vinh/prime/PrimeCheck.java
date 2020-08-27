package org.vinh.prime;

import org.vinh.utils.Utils;

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
				if (Utils.isPrime(number)) {
					primeCount++;
				}
			}
		}
		return primeCount;
	}


}
