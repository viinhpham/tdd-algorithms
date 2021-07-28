package org.vinh.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : Vinh Pham.
 * Date: 27/06/2021.
 * Time : 11:48.
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 */
public class LongestSubString {
	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		Map<Character,Integer> distinctMap = new HashMap();
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer index = distinctMap.get(c);
			if (index != null) {
				start = Math.max(start, index + 1);
			}
			distinctMap.put(c, i);
			max =  Math.max(max, i - start + 1);

		}
		return max;


	}
}
