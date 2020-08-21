package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/21/20
 *
 *1. A Nice array is alway have 13 right after a 5, if there is no 5 then it is a Nice array as well.
 *Example: {5,13,11,2,4}, {5,13,2,3,5,13}, {13,2} is nice, and {13,5} is not nice
 */
public class NiceArray {
	public boolean isNiceArray(int[] array) {
		boolean isNice = false;

		int length = array.length;
		//exception case
		if (length == 0) {
			return false;
		}

		for (int i = 0; i < length; i++) {
			//Solution 1
			/*if (i == length - 1 &&  array[i] == 5) {
				return false;

			}

			if (i < length -1 && array[i] == 13 &&  array[i + 1] == 5) {
				return false;
			}

			if (array[i] == 5 && array[i + 1] == 13 || array[i] == 13) {
				isNice = true;
			}*/
			//Solution 2
			if (!isNice  && (array[i] == 13 || array[i] == 5)) {
				isNice = true;
				continue;
			}

			if (isNice && array[i] == 5){
				isNice = false;
			}
		}
		return isNice;
	}
}
