package org.vinh.tdd.zeroPlentifull;

/**
 * Created by vinh.phamquoc on 2/12/20
 */
public class ZeroPlentifull {
	public int isZeroPlentifull(int[] array) {
		//Contain at least 1 zero and length >= 4
		if (array.length < 4) {
			return 0;
		}
		int count = 0;
		int numberOfZeroP = 0;
		//find if is sequence of zero then count++
		for (int k = 0; k < array.length; k++) {
			if (array[k] == 0) {
				count += 1;
			} else if (count > 1) {
				return 0;
			}
			if (count >= 4) {
				numberOfZeroP++;
				count = 0;
			}
		}
		return numberOfZeroP;
	}

}
