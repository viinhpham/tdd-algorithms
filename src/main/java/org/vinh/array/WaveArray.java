package org.vinh.array;

/**
 * Created by vinh.phamquoc on 8/30/20
 */
public class WaveArray {
	//A wave array is defined to an array which does not contain two even numbers or two odd numbers in adjacent locations.
// So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave arrays.
// But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each other.
//Write a function named isWave that returns 1 if its array argument is a Wave array, otherwise it returns 0.
	public int isWaveArray(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		if (array.length == 1) {
			return 1;
		}
		//when i > 0
		// dynamic programming
		boolean previousEven = array[0] % 2 == 0;
		boolean currentEven = false;

		for (int i = 1; i < array.length - 1; i++) {
			// dynamic programming
			currentEven = array[i] % 2 == 0;

			if ((currentEven && previousEven) || (!currentEven && !previousEven)) {
				return 0;
			}
			previousEven = currentEven;


		}
		return 1;
	}
}
