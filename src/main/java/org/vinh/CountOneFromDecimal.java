package org.vinh;

/**
 * Created by vinh.phamquoc on 8/22/20
 */
public class CountOneFromDecimal {
	public int countOne(int n) {
		int count = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				count++;
			}
			n /= 2;
		}
		return count;
	}
}
