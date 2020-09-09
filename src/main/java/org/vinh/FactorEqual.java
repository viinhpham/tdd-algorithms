package org.vinh;

/**
 * @author vinh.phamquoc on 9/9/20
 */
public class FactorEqual {
	//Two integers are defined to be factor equal, if they have the same number of factors.
// For example, integers 10 and 33 are factor equal because,
// 10 has four factors: 1, 2, 5, 10 and 33 also has four factors: 1, 3, 11, 33.
// On the other hand, 9 and 10 are not factor equal since 9 has only three factors: 1, 3, 9
//and 10 has four factors: 1, 2, 5, 10.
//Write a function named factorEqual(int n, int m) that returns 1 if n and m are factor equal and 0 otherwise.
//The signature of the function is int factorEqual(int n, int m)
	public int factorEqual(int n, int m) {
		int condition = n > m ? n : m;
		int numFactorN = 0, numFactorM = 0;
		for (int i = 2; i <= condition / 2; i++) {
				if (n % i == 0 && i <= n / 2) {
					numFactorN++;
				}

				if (m % i == 0 && i <= m / 2) {
					numFactorM++;
				}
		}
		return numFactorN == numFactorM ? 1 : 0;

	}
}
