package org.vinh.nUniqueArray;

/**
 * Created by vinh.phamquoc on 2/6/20
 */
public class NUnitArray {
	boolean isNUnit(int[]array, int n) {
		int count = 0;
		for (int i = 0; i < array.length;  i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (n == array[i] + array[j]) {
					count++;
				}
				if (count > 1) {
					return false;
				}
			}
		}
		return count == 1;
	}
}
