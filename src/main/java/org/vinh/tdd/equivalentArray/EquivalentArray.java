package org.vinh.tdd.equivalentArray;

/**
 * Created by vinh.phamquoc on 2/22/20
 */
public class EquivalentArray {

	public int equivalentArrays(int[] a1, int[] a2) {
		int isEquivalent = 1;

		if (a1.length == a2.length) {
			isEquivalent = getIsEquivalent(a1, a2, isEquivalent);
			isEquivalent = getIsEquivalent(a2, a1, isEquivalent);
		} else if (a1.length > a2.length) {
			isEquivalent = getIsEquivalent(a1, a2, isEquivalent);
		} else {
			isEquivalent = getIsEquivalent(a2, a1, isEquivalent);
		}

		return isEquivalent;
	}

	private int getIsEquivalent(int[] a1, int[] a2, int isEquivalent) {

		for (int i = 0; i < a1.length && isEquivalent == 1; i++) {
			int exist = 0;
			for (int j = 0; j < a2.length && exist == 0; j++) {
				if (a1[i] == a2[j]) {
					exist = 1;
				}
			}
			if (exist == 0) {
				isEquivalent = 0;
			}
		}
		return isEquivalent;
	}

}
