package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/29/20
 */
public class HollowArray {
	//3. An array is said to be hollow if it contains 3 or more zeroes in the middle
//that are preceded and followed by the same number of non-zero elements.
// Write a function named isHollow that  accepts an integer array and returns 1 if it is a hollow array, otherwise it returns 0
//Examples:  isHollow({1,2,4,0,0,0,3,4,5}) returns 1.
//  isHollow ({1,2,0,0,0,3,4,5}) returns 0.
// isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns 0.
//  isHollow ({1,2, 0,0, 3,4}) returns 0.
	public int isHollow(int[] array) {
		int length = array.length;
		if (length == 0) {
			return 0;
		}
		int precededNum = 0, followedNum = 0, zeroNum = 0;
		int i = 0, j = length - 1;
		//two pointer
		while (i <= j) {
			if (array[i] != 0) {
				precededNum++;
			}

			if (array[j] != 0) {
				followedNum++;
			}

			if (array[i] == 0 && array[j] == 0) {
				//incase of odd-length array
				if (i == j) {
					zeroNum++;
				}
				//incase of even-length array
				else {
					zeroNum+=2;
				}
			}
			i++;
			j--;
		}
		return zeroNum >= 3 && precededNum == zeroNum && zeroNum == followedNum ? 1 : 0;
	}

}
