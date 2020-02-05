package org.vinh.stantonMeasure;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
public class StantonMeasure {
	public int stantonMesure(int... array) {
		if (array.length == 0) {
			return 0;
		}
		if (array.length ==1 &&  (array[0] == 1 || array[0] == 0)) {
			return 1;
		}
		int nextToCount = 1;
		int countResult;
		boolean canCountMore = true;
		while (canCountMore) {
			canCountMore = false;
			countResult = 0;
			//find number of 1s call n
			for (int i : array) {
				if (i == nextToCount) {
					countResult++;
					canCountMore = true;
				}
			}
			if (countResult > 0) {
				nextToCount = countResult;
			}
		}
		return nextToCount;
	}
}
