package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/30/20
 * @author vinh.phamquoc
 */
public class BeanArray {
	// 3. An array is defined to be a Bean array if it meets the following conditions
//a. If it contains a 9 then it also contains a 13.
//b. If it contains a 7 then it does not contain a 16.
//So {1, 2, 3, 9, 6, 13}  and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are Bean arrays.
//The following arrays are not Bean arrays:
//a. { 9, 6, 18} (contains a 9 but no 13)
//b. {4, 7, 16} (contains both a 7 and a 16)
	public int isBean(int[] array) {
		int length = array.length;
		if (length == 0) {
			return 0;
		}
		boolean has9 = false, has13 = false, has7 = false;
		for (int i : array) {
			switch (i) {
				case 9:
					has9 = true;
					break;
				case 13:
					has13 = true;
					break;
				case 7:
					has7 = true;
					break;
				case 16:
					if (has7) {
						return 0;
					}
				default:
					break;
			}
		}
		if (has9 && !has13) {
			return 0;
		}

		return 1;
	}
}
