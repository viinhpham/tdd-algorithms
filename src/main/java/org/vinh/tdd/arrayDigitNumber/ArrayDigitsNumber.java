package org.vinh.tdd.arrayDigitNumber;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
public class ArrayDigitsNumber {
	public boolean resqEqual(int [] array, int n){
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != n % 10) {
				return false;
			}
			n /= 10;
		}

		return true;
	}


}
