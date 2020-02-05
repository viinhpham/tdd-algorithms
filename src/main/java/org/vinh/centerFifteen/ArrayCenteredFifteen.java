package org.vinh.centerFifteen;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
public class ArrayCenteredFifteen {
	public boolean isCentered15(int... array) {
		int sum = 0;
		//sum to 15
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				if (sum == 15 && (i - 0 == array.length - 1 - j)) {
					return true;
				} else if (sum > 15) {
					sum = 0;
					break;
				}
			}
		}
		return false;
	}
}
