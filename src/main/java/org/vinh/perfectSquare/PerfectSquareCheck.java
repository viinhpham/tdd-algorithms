package org.vinh.perfectSquare;

/**
 * Created by vinh.phamquoc on 2/4/20
 */
public class PerfectSquareCheck {
	public int countPair(int [] array){
		int count = 0;

		for (int i : array) {
				count += countPerfectSquare(i, array);
		}
		return count;
	}

	private int countPerfectSquare(int input, int[] array) {
		int count = 0;
		for(int i : array) {
			if (input < i && input > 0 && i > 0 && Math.sqrt(input + i) % 1 == 0){
				count += 1;
			}
		}
		return count;
	}
}
