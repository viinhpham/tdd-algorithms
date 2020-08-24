package org.vinh;

/**
 * Created by vinh.phamquoc on 8/24/20
 */
//1. A normal number is defined to be one that has no odd factors, except for 1 and possibly itself.
//Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0.
//Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd factor. 10 is not a normal number since 5 is an odd factor.

public class NormalNumber {
	public int isNormal(int n) {
		if (n == 1) {
			return 1;
		}
		for (int i = 2; i <= n/2; i++){
			if (n % i == 0 && i % 2 == 1) {
				return 0;
			}
		}
		return 1;
	}
}
