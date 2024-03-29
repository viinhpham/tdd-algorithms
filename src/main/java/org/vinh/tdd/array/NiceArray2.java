package org.vinh.tdd.array;

/**
 * Created by vinh.phamquoc on 9/2/20
 */
public class NiceArray2 {
//3. A Nice array is defined to be an array where for every value n in the array,
//there is also an element n-1 or n+1 in the array.
//For example, {2, 10, 9, 3} is a Nice array because
//2 = 3-1
//10 = 9+1
//3 = 2 + 1
//9 = 10 -1
//Other Nice arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
//The array {3, 4, 5, 7} is not a Nice array because of the value 7
//which requires that the array contains either the value 6 (7-1)
//or 8 (7+1) but neither of these values are in the array.
	public int isNiceArray(int [] array){
		for (int i : array) {
			if (!isExists(array, i+1, i -1)) {
				return 0;
			}
		}
		return 1;
	}

	private boolean isExists(int [] array, int n, int m) {

		for (int i: array) {
			if (i == n || i == m) {
				return true;
			}
		}
		return false;
	}

}
