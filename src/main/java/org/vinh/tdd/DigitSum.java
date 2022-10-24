package org.vinh.tdd;

/**
 * Created by vinh.phamquoc on 8/26/20
 */
//Write a function named isDigitSum that returns 1 if sum of all digits of the first argument is less than the second argument and 0 otherwise.
//For example isDigitSum(32121,10 ) would return 1 because 3+2+1+2+1 = 9 < 10.

//More examples:
//isDigitSum(32121,9) returns 0, isDigitSum(13, 6) returns 1, isDigitSum(3, 3) returns 0

//The function should return -1 if either argument is negative, so isDigitSum(-543, 3) returns -1.
public class DigitSum {
	public int isDigitSum(int i, int j){
		if (i < 0 || j < 0) {
			return 1;
		}
		int total = 0;
		while (i > 0) {
			total += i % 10;
			i/=10;
		}
		return total < j ? 1: 0;
	}
}
