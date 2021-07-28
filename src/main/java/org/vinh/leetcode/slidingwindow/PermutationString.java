package org.vinh.leetcode.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Author : Vinh Pham.
 * Date: 28/06/2021.
 * Time : 10:56.
 * Given two strings s1 and s2, return true if s2 contains the permutation of s1.
 *
 * In other words, one of s1's permutations is the substring of s2.
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * Example 2:
 *
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 */
public class PermutationString {
	public static void main(String[] args) {
		checkInclusion("ab", "eidba000");


	}


	/*public boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
		}
		int start = 0;
		for (int s = 0; s < s2.length(); s++) {
			if (map.containsKey(s2.charAt(s))) {
				map.put(s2.charAt(s), map.get(s2.charAt(s) - 1));
			}

		}

	}*/
	public static boolean checkInclusion(String s1, String s2) {
		int [] freq = new int[26];

		for(char ch: s1.toCharArray()){
			freq[ch-'a']++;
		}

		int left=0;
		int right = 0;
		int count = s1.length();

		while(right<s2.length()){

			if(freq[s2.charAt(right)-'a']>=1){
				count--;
			}
			freq[s2.charAt(right)-'a']--;
			right++;

			if(count == 0){
				return true;
			}

			if(right-left == s1.length()) {
				if(freq[s2.charAt(left)-'a'] > -1){
					count ++;
				}
				freq[s2.charAt(left)-'a']++;
				left++;
			}
		}LinkedList l = new LinkedList();
		return false;
	}


}
