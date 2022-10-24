package org.vinh.tdd.array;

/**
 * @author vinh.phamquoc on 9/10/20
 */
public class DuplicateRemoval {
//Given a sorted array, nums, remove the duplicates in-place such that each element appears only once and return the new length.
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

//Example 1:

//Given nums = [1,1,2],
//Output = 2
//Example 2:

	//Given nums = [0,0,0,1,1,2,2,3,3,4],
//Output = 5
	public int removeDuplicate(int[] array) {
		//Move all unique number to the left
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || array[i] != array[i - 1]) {
				array[n++] = array[i];
			}
		}

		return n;
	}

}
