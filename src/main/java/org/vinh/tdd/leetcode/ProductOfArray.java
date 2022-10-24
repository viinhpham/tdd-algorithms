package org.vinh.tdd.leetcode;

import java.util.Arrays;

/**
 * Author : Vinh Pham.
 * Date: 08/06/2021.
 * Time : 14:57.
 */
public class ProductOfArray {
	public int [] productOfArray(int [] nums){


		int[] answer = new int[nums.length];
		int product = 1;

		for (int i = 0; i < nums.length; i++) {
			answer[i] = product;
			product *= nums[i];
		}
		product = 1;
		for (int j = nums.length - 1; j >= 0; j--) {
			answer[j] *= product;
			product *= nums[j];
		}

		Arrays.stream(answer).forEach(System.out::println);
		return answer;
	}
}
