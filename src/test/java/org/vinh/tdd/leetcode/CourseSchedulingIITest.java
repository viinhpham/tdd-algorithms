package org.vinh.tdd.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

/**
 * Author : Vinh Pham.
 * Date: 11/06/2021.
 * Time : 15:58.
 */
class CourseSchedulingIITest extends AbstractTest {
	@InjectMocks
	private CourseSchedulingII courseSchedulingII;
	@Test
	public void testCourseScheduling(){
		Assertions.assertArrayEquals(new int[]{0, 1}, courseSchedulingII.findOrder(2, new int[][]{{1, 0}}));
	}


}