package org.vinh.tdd.guthrie;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
public class GuthriSequence {
	public boolean isGuthriSequence(int... array){
		//loop to check the iterate number
		boolean result = false;
		for (int i = 0; i < array.length - 1; i++) {
			//if odd then *3 then adding 1
			if (array[i] % 2 != 0 && array[i + 1] != ((array[i] * 3) +1)
					|| array[i] % 2 == 0 && array[i + 1] != (array[i]/2)) {
				result = false;
				break;
			} else {
				result = true;
			}

		}
		return result && array[array.length -1] == 1;
	}
}
