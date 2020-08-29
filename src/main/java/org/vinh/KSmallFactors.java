package org.vinh;

/**
 * Created by vinh.phamquoc on 8/29/20
 */
public class KSmallFactors {
	// Given a positive integer k, another positive integer
//n is said to have k-small factors if n can be written as a product u*v
//where u and v are both less than k. For instance, 20 has 10-small factors
//since both 4 and 5 are less than 10 and 4*5 = 20. (For the same reason,
// it is also true to say that 20 has 6-small factors, 7-small factors,
//  8-small factors, etc). However, 22 does not have 10-small factors
// since the only way to factor 22 is as 22 = 2 * 11,   and 11 is not less than 10.
	public int hasKSmallFactors(int k, int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0 && i < k && n / i < k) {
				return 1;
			}
		}
		return 0;
	}
}
