package org.vinh.tdd.stantonMeasure;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
public class StantonMeasure {
	public int stantonMeasure(int... array) {
		if (array.length == 0) {
			return 0;
		}
		if (array.length == 1 && (array[0] == 1 || array[0] == 0)) {
			return 1;
		}
		int nextToCount = 1;
		int countResult;
		while (true) {
			//find number of 1s call nextToCount
			countResult = countNextStanton(nextToCount, array);

			if (countResult > 0) {
				nextToCount = countResult;
			} else {
				return nextToCount;
			}
		}
	}

	private int countNextStanton(int nextToCount, int[] array) {
		int countResult = 0;
		for (int i : array) {
			if (i == nextToCount) {
				countResult++;
			}
		}
		return countResult;

	}
}
