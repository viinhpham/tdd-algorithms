package org.vinh.tdd;

/**
 * Created by vinh.phamquoc on 8/27/20
 */
// An Evens number is an integer whose digits are all even.
//For example 2426 is an Evens number but 3224 is not.
//Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it returns 0.
public class EvensNumber {
	public int isEvens(int n) {

		while (n > 0) {
			if ((n % 10) % 2 != 0){
				return 0;
			}
			n /= 10;
		}
		return 1;

	}
}
