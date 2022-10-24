package org.vinh.tdd.tenfactor;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
public class TenFactor {
	public int[] solve10() {

		//x! + y! = 10!
		//find x!
		int[] array = new int[2];
		array[1] = 0;
		int nfactorResult = calculateFactor(10);

		int secondFactorNumber = 0;
		for (int i = 1; i < 10; i++) {
			secondFactorNumber = findMatchedSubtract(calculateFactor(i), nfactorResult, 10);
			if (secondFactorNumber > 0) {
				array[0] = i;
				array[1] = secondFactorNumber;
				break;
			}
		}
		return array;
	}

	private int findMatchedSubtract(int firstFactor, int factorN, int n) {
		for (int i = n-1; i > 0; i--) {
			if (firstFactor == factorN - calculateFactor(i)) {
				return i;
			}
		}
		return 0;
	}

	private int calculateFactor(int n) {
		int tenfactor = n;
		for (n = n - 1; n > 0; n--) {
			tenfactor *= n;
		}
		return tenfactor;
	}
}
