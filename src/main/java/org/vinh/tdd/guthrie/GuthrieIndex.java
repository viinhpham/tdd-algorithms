package org.vinh.tdd.guthrie;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
public class GuthrieIndex {
	public int guthrieIndex(int n) {
		int count = 0;
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n * 3) + 1;
			}
			count++;
		}

		return count;
	}
}
