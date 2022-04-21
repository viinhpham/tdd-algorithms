package org.vinh.mahav;

/**
 * Created by vinh.phamquoc on 1/8/20
 */
public class MadHavArrayCheck {
	public int isMahavArray(int[] array) {
		if (array.length < 2) {
			return 0;
		}
		int sum = 0,
				count = 0,
				end = 2;
		boolean isMadHavLength = false,
				isMaha = false;

		for (int k = 1; k <= array.length; k++) {
			if (array.length == k * (k + 1) / 2) {
				isMadHavLength = true;
				break;
			}
		}
		if (!isMadHavLength) {
			return 0;
		}

		for (int i = 0; i < array.length; i++) {

			if (i > 0) {
				sum += array[i];
				count++;
			}

			if (end == count && sum == array[0]) {
				sum = 0;
				count = 0;
				end += 1;
				isMaha = true;
			} else {
				isMaha = false;
			}

		}
		return isMaha ? 1 : 0;
	}
}
