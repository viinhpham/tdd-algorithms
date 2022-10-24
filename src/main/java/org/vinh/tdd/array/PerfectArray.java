package org.vinh.tdd.array;

import org.vinh.tdd.utils.Utils;

/**
 * Created by vinh.phamquoc on 8/22/20
 *
 *An array is called perfect if each element smaller or equals the sum of other remaining elements.
 *Example: {12,2,10} is a perfect array because 12<=2+10, 2<=12+10, 10<=12+2; and {5,2,1] is not perfect because 5 > 2+1
 */
 public class PerfectArray {
	public boolean isPerfectArray(int[] array){
		boolean isPerfect = true;
		int length = array.length;
		//exceptional cases:
		if (length == 0) {
			return false;
		}
		if (length == 1) {
			return true;
		}
		//normal case
		int total  = Utils.sumArray(array);
		// get 1 number i
		for (int i : array) {
			//sum all remain numbers then subtract to  i
			//compare
			if (i > total - i) {
				return false;
			}
		}

		return isPerfect;
	}
}
