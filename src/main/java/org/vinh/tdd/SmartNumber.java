package org.vinh.tdd;

/**
 * @author vinh.phamquoc on 9/9/20
 */
public class SmartNumber {
	//1. An integer is defined to be a Smart number if it is an element
//in the infinite sequence 1, 2, 4, 7, 11, 16 … Note that
//2-1=1, 4-2=2, 7-4=3, 11-7=4, 16-11=5 so for k>1, the kth element of the sequence
//is equal to the k-1th element + k-1. For example, for k=6, 16 is the kth element
//and is equal to 11 (the k-1th element) + 5 ( k-1).
//Write function named isSmart that returns 1 if its argument is a Smart number, otherwise it returns 0.
// So isSmart(11) returns 1, isSmart(22) returns 1 and isSmart(8) returns 0 .
	public int isSmart(int n) {
		if (n <= 0) {
			return 0;
		}
		int smartNumb = 1;
		for (int i = 1; smartNumb <= n; i++) {
			if (smartNumb == n) {
				return 1;
			}
			smartNumb += i;
		}

		return 0;

	}
}
