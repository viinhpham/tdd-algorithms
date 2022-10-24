package org.vinh.tdd.leetcode;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;
import org.vinh.tdd.leetcode.slidingwindow.MaxCardPoint;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Vinh Pham.
 * Date: 27/06/2021.
 * Time : 10:56.
 */
class MaxCardPointTest extends AbstractTest {
	@InjectMocks
	private MaxCardPoint maxCardPoint;
	@Test
	public void testMaxCardPointSuccess(){
		assertEquals(12, maxCardPoint.maxScore(new int[]{1,2,3,4,5,6,1},3));
	}

	@Test
	public void testMaxCardPointSuccess2(){
		assertEquals(maxCardPoint.maxScore(new int[]{1,79,80,1,1,1,200,1},3), 202);
	}

}