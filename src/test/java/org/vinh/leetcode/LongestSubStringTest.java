package org.vinh.leetcode;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Vinh Pham.
 * Date: 27/06/2021.
 * Time : 16:28.
 */
class LongestSubStringTest extends AbstractTest {
	@InjectMocks
	private LongestSubString longestSubString;
	@Test
	public void testLongestSubStringSuccess(){
		assertEquals(1, longestSubString.lengthOfLongestSubstring(" "));
	}

	@Test
	public void testLongestSubStringSuccess2(){
		assertEquals(2, longestSubString.lengthOfLongestSubstring("abba"));
	}

	@Test
	public void testLongestSubStringSuccess3(){
		assertEquals(3, longestSubString.lengthOfLongestSubstring("pwwkew"));
	}


	@Test
	public void testLongestSubStringSuccess4(){
		assertEquals(3, longestSubString.lengthOfLongestSubstring("abcabcbb"));
	}


}