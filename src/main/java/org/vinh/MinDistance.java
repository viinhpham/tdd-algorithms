package org.vinh;

/**
 * Created by vinh.phamquoc on 8/30/20
 */
public class MinDistance {
//Write a function named minDistance that returns the smallest distance between two factors of a number.
// For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013.
// minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 - 11 = 2).
// As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8
// and the smallest distance between any two factors is 1 (2 – 1 = 1).
	public int minDistance(int n) {
		if (n == 0 || n == 1) {
			return 0;
		}

		int minDistance = n - 1;
		int previousFactor = 1;
		int currentMin = minDistance;

		for (int i = 2; i <= n / 2; i++){
			if (n % i == 0) {
				// support negative integer
				currentMin = Math.min(i - previousFactor,  n - i);
				if (minDistance > currentMin) {
					minDistance = currentMin;
				}
				previousFactor = i;
			}
		}
		return minDistance;
	}
}
