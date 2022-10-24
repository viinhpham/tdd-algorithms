package org.vinh.tdd.array;

/**
 * @author vinh.phamquoc on 9/9/20
 */
public class MeeraArray1 {
//Define a Meera array to be an array a if it satisfies two conditions:
//(a) a[i] is less than i for i = 0 to a.length-1.
//(b) sum of all elements of a is 0.

	//For example, {-4, 0, 1, 0, 2, 1} is a Meera array because
//-4 = a[0] < 0
//0 = a[1] < 1
//1 = a[2] < 2
//0 = a[3] < 3
//2 = a[4] < 4
//1 = a[5] < 5
//and -4 + 0 + 1 + 0 + 2 + 1 = 0
//{-8, 0, 0, 8, 0} is not a Meera array because a[3] is 8 which is not less than 3. Thus condition (a) fails. {-8, 0, 0, 2, 0} is not a Meera array because -8 + 2 = -6 not equal to zero. Thus condition (b) fails.
//Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise it returns 0.
	public int isMeera(int[] array) {
		int total = 0;
		int length = array.length;
		if (length == 0) {
			return 0;
		}
		for (int i = 0; i < length; i++) {
			if (array[i] >= i) {
				return 0;
			}
			total += array[i];
		}
		return total == 0 ? 1 : 0;
	}
}
