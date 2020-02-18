package org.vinh.decodeArray;

/**
 * Created by vinh.phamquoc on 2/13/20
 */
public class DecodeArray {
	public int decodeArray(int... array) {
		int result = 0;
		int countZero = 0;
		int isNegative = 1;

		if (array[0] == -1) {
			isNegative = -1;
		}
		for (int i : array) {

			if (i == 0) {
				countZero++;
			}

			if (i > 0) {
				if (countZero > 0 && result == 0) {
					result += countZero;
				} else {
					result = result * 10 + countZero;
				}
				countZero = 0;
			}
		}

		return result * isNegative;
	}
}
