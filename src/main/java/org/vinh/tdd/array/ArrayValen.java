package org.vinh.tdd.array;

/**
 * Created by vinh.phamquoc on 8/23/20
 */
public class ArrayValen {
	public int isOddValen(int[] array) {
		int length = array.length;
		boolean isOdd = false;
		for (int i : array) {
			if (i % 2 == 1) {
				isOdd = true;
				break;
			}
		}

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] == array[j] && isOdd) {
					return 1;
				}
			}
		}
		return 0;

	}
}
