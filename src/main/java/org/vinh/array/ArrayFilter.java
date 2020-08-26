package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/25/20
 */
//An array is defined to be a Filter array if it meets the following conditions
//a. If it contains 9 then it also contains 11.
//b. If it contains 7 then it does not contain 13.
//So {1, 2, 3, 9, 6, 11} and {3, 4, 6, 7, 14, 16}, {1, 2, 3, 4, 10, 11, 13} and {3, 6, 5, 5, 13, 6, 13} are Filter arrays.
//The following arrays are not Filter arrays: {9, 6, 18} (contains 9 but no 11), {4, 7, 13} (contains both 7 and 13)
//Write a function named isFilter that returns 1 if its array argument is a Filter array, otherwise it returns 0.
public class ArrayFilter {
	public int isFilter(int[] array) {
		if (array.length == 0) {
			return 0;
		}

		boolean has9 = false, has11 = false, has7 = false;
		for (int i : array) {
			switch(i) {
				case 9:
					has9 = true;
					break;
				case 11:
					if (has9){
						has11 = true;
					}
					break;
				case 7:
					has7 = true;
					break;
				case 13:
					if (has7) {
						return 0;
					}
					break;
				default:
					break;
			}
		}
		if (has9 && !has11) {
			return 0;
		}

		return 1;
	}
}
