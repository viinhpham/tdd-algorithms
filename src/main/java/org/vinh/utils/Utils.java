package org.vinh.utils;

/**
 * Created by vinh.phamquoc on 8/22/20
 */
public class Utils {
	public static int sumArray(int[]array) {
		int total = 0;
		for(int j : array) {
			total+=j;
		}
		return total;
	}
	public static int sumArrayRange(int[]array, int start, int end) {
		int total = 0;
		for(int i = start; i <= end ; i++) {
			total += array[i];
		}
		return total;
	}
}
