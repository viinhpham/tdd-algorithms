package org.vinh;

/**
 * Created by vinh.phamquoc on 9/2/20
 */
public class ContinuousFactor {
	// 1. An integer is defined to be “continuous factored”
//if it can be expressed as the product of two or more continuous integers greater than 1.
//Examples of “continuous factored” integers are:
//6 = 2 * 3.
//60 = 3 * 4 * 5
//120 = 4 * 5 * 6
//90 = 9*10
//Examples of integers that are NOT “continuous factored” are: 99 = 9*11, 121=11*11, 2=2, 13=13
	public int isContinuousFactored(int n) {
		int recall = n;
		int j = 2;
		int condition = n/2;
		for (int i = 2; i<= condition && n > 1;i++) {
			if (n % i == 0) {
				n/=i;
			} else {
				i = j++;
				n = recall;
			}
		}
		return n == 1 ? 1 : 0;
	}
}
