package org.vinh.tdd.sortRGB;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.vinh.tdd.sortRGB.Ball.BLUE;
import static org.vinh.tdd.sortRGB.Ball.GREEN;
import static org.vinh.tdd.sortRGB.Ball.RED;

/**
 * Author : Vinh Pham.
 * Date: 12/22/22.
 * Time : 9:24 PM.
 */
class RGBSortTest extends AbstractTest {
	@InjectMocks
	RGBSort rgbSort;

	@Test
	void testRGBSort() {
		var balls = new Ball[]{new Ball(GREEN), new Ball(GREEN), new Ball(BLUE), new Ball(RED)};
		var expected = new Ball[]{new Ball(RED), new Ball(BLUE), new Ball(GREEN), new Ball(GREEN)};
		rgbSort.sort(balls);
		assertArrayEquals(expected, balls);
	}
	@Test
	void testRGBSort1() {
		var balls = new Ball[]{new Ball(BLUE), new Ball(GREEN), new Ball(BLUE), new Ball(RED)};
		var expected = new Ball[]{new Ball(RED), new Ball(BLUE), new Ball(BLUE), new Ball(GREEN)};
		rgbSort.sort(balls);
		assertArrayEquals(expected, balls);
	}

}