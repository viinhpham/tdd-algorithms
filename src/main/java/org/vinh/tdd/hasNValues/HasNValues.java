package org.vinh.tdd.hasNValues;

/**
 * Created by vinh.phamquoc on 2/22/20
 */
public class HasNValues {

	public int hasNValues(int[] array, int n) {
		int count = 1;
		for (int i = 1; i < array.length; i++) {
			if (!isDuplicated(array, i, array[i])) {
				count++;
			}
		}
		return count == n ? 1 : 0;
	}

	private boolean isDuplicated(int[] array, int endIndex, int value) {

		for (int i = 0; i < endIndex; i++) {
			if (array[i] == value) {
				return true;
			}
		}
		return false;
	}

}
