package org.vinh.weightsum;

/**
 * Created by vinh.phamquoc on 2/22/20
 */
public class WeightedSum {

	public int computeWeightedSum(int a[]) {

		int weightedSum = 0;

		for (int i : a) {
			if (i % 2 == 0) {
				weightedSum += 2 * i;
			} else {
				weightedSum += 3 * i;
			}
		}

		return weightedSum;
	}
}
