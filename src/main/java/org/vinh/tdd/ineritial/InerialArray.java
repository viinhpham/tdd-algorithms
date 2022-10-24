package org.vinh.tdd.ineritial;

/**
 * Created by vinh.phamquoc on 1/14/20
 */
public class InerialArray {
	public boolean isInerialArray(int[] array) {

		if (array.length <= 1) {
			return false;
		}

		boolean atLeastOneOdd = false;
		Integer minOdd = null,
				maxValue = array[0];

		for (int value : array) {
			if (value > maxValue) {
				maxValue = value;
			}
			if (value % 2 != 0) {
				atLeastOneOdd = true;
				if (minOdd == null || value < minOdd) {
					minOdd = value;
				}
			}
		}

		return atLeastOneOdd && maxValue % 2 == 0 && checkAnyOddLargerThanEvent(minOdd, maxValue, array) ;
	}

	private boolean checkAnyOddLargerThanEvent(Integer minOdd, int maxValue, int[] array){
		for (int k : array) {
			if (k % 2 == 0 && minOdd != null && minOdd < k && k != maxValue) {
				return false;
			}
		}
		return true;
	}

}
