package org.vinh.tdd.array;

import org.vinh.tdd.utils.Utils;

/**
 * Created by vinh.phamquoc on 8/31/20
 */
public class MeeraArray {
// A Meera array is defined to be an array such that for all values n in the array,
//the value 2*n is not in the array. So {3, 5, -2} is a Meera array
// because 3*2, 5*2 and -2*2 are not in the array.
// But {8, 3, 4} is not a Meera array because for n=4, 2*n=8 is in the array.
public int isMeeraArray(int [] array) {
	for (int i : array) {
		if (Utils.isExists(2 * i, array)) {
			return 1;
		}
	}
	return 0;
}

}
