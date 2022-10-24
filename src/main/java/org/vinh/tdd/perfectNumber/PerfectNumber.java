package org.vinh.tdd.perfectNumber;

/**
 * Created by vinh.phamquoc on 2/6/20
 */
public class PerfectNumber {

	public int henry(int ith, int jth) {

		if (ith > jth) {
			int tempt = ith;
			ith = jth;
			jth = tempt;
		}
		int count = 0, result = 0;
		int currentSum = 0;
		int m = 1;
		while (count <= jth) {

			for (int n = 1; n <= m/2; n++) {
				if (m % n == 0) {
					currentSum += n;
				}
			}

			if (currentSum == m) {
				count++;
				if (count == ith || count == jth) {
					result += currentSum;
				}
				if (count == jth) {
					break;
				}
			}
			currentSum = 0;
			m++;
		}
		return result;
	}
}
