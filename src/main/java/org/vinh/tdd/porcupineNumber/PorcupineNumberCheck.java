package org.vinh.tdd.porcupineNumber;

/**
 * Created by vinh.phamquoc on 2/4/20
 */
public class PorcupineNumberCheck {

	public int findPorcupineNumber(int n) {
		int porcupine = 0;
		n++;
		while (true) {
			// check if it is a prime with 9
			if (isPrime(n) && n % 10 == 9) {
				porcupine = n;
			}
			//find next porcupine
			if (porcupine != 0) {
				if (hasNextPrimeEndwith9(n)) {
					return porcupine;
				} else {
					porcupine = 0;
				}
			}
			n++;
		}
	}

	private boolean hasNextPrimeEndwith9(int n) {
		while (true) {
			n++;
			if (isPrime(n)) {
				return n % 10 == 9;
			}
		}
	}

	private boolean isPrime(int n) {
		if (n > 1) {
			for (int divider = 2; divider * 2 < n; divider++) {
				if (n % divider == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
