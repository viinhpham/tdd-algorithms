package org.vinh.centerFifteen;

import org.vinh.utils.Utils;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
public class ArrayCenteredFifteen {
	public boolean isCentered15(int... array) {
		int sum = 0;
		//sum to 15
		//Solution 1
		/*for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				if (sum == 15 && (i == array.length - 1 - j)) {
					return true;
				} else if (sum > 15) {
					sum = 0;
					break;
				}
			}
		}*/
		//{3, 2, 10, 4, 1, 6, 9}
		//Solution 2-->better
		int i = 0, j = array.length - 1;
		while (i <= j) {
			if (Utils.sumArrayRange(array, i, j) == 15) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}
}
