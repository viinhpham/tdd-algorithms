package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/23/20
 */
public class DaphneArray {
	public int isDaphne(int [] array) {
		int length = array.length;
		if (length == 0) {
			return 0;
		}
		//check if first element is even or add
		//true if it's even
		boolean isEven = array[0]%2 == 0;
		//loop from second element
		//if first element is even and any of remainding items is odd then return 0 immediately.
		for (int i = 1; i < length; i++) {
			if (isEven && array[i] % 2 != 0 || !isEven && array[i] % 2 == 0) {
				return 0;
			}
		}
		return 1;
	}
}
