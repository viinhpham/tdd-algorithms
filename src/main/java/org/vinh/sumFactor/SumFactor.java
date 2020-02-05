package org.vinh.sumFactor;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
public class SumFactor {
	public int sumFactor(int... array){
		int count = 0;
		int sum = sumAllElement(array);
		for (int i : array) {
			if (i == sum) {
				count++;
			}
		}
		return count;
	}

	private int sumAllElement(int[] array){
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
}
