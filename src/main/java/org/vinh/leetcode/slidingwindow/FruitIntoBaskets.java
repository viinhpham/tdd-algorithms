package org.vinh.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : Vinh Pham.
 * Date: 04/07/2021.
 * Time : 15:05.
 */
public class FruitIntoBaskets {
	public int totalFruit(int[] tree) {
		if (tree ==null & tree.length == 0) {
			return 0;
		}

		Map<Integer, Integer> basket = new HashMap();
		int left = 0;
		int max = 0;
		int r = 0;

		//loop throught trees
		while (r < tree.length) {
			if (basket.size() <= 2) {
				basket.put(tree[r], r++);
			}
			if (basket.size() > 2) {
				int min = tree.length - 1;
				for (Integer value : basket.values()) {
					min =  Math.min(min, value);
				}
				basket.remove(min);
				left = min + 1;
			}
			max = Math.max(max, r - left);

		}

		return max;

	}
}
