package org.vinh.tdd;

/**
 * Created by vinh.phamquoc on 8/31/20
 */
public class CountDigit {
	//. Write a function named countDigit that returns the number of times that a given digit appears in a positive number.
// For example countDigit(32121, 1) would return 2 because there are two 1s in 32121. Other examples:
//countDigit(33331, 3) returns 4
//countDigit(33331, 6) returns 0
//countDigit(3, 3) returns 1
//The function should return -1 if either argument is negative, so
//countDigit(-543, 3) returns -1.
	public int countDigit(int n, int m) {
		if (n * m < 0) {
			return -1;
		}
		int count = 0;
		for (int i = n; i > 0; i /= 10) {
			if (i % 10 == m) {
				count++;
			}
		}
		return count;
	}
}
