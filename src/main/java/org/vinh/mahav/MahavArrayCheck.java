package org.vinh.mahav;

/**
 * Created by vinh.phamquoc on 1/8/20
 */
public class MahavArrayCheck {
	public int isMahavArray(int[] array){
		if (array.length < 2) {
			return 0;
		}
		int sum = 0;
		int end = 2;
		boolean isNotMahavLength = false;
		boolean isMaha = false;
		int count = 0;
		for(int k = 1; k <= array.length*2; k++) {
			if (array.length == k*(k+1)/2){
				isNotMahavLength = true;
			}
		}
		 if (!isNotMahavLength) {
		 	return 0;
		 }

		for (int i = 0; i < array.length; i++) {

			if (i > 0){
				sum += array[i];
				count++;
			}

			if(end == count && sum == array[0]) {
				sum = 0;
				count = 0;
				end += 1;
				isMaha = true;
			} else {
				isMaha = false;
			}

		}
		return isMaha ? 1 : 0;
	}
}
