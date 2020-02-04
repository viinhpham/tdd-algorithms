package org.vinh.perfectSquare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/4/20
 */
class PerfectSquareCheckTest extends AbstractTest {
	@InjectMocks
	PerfectSquareCheck perfectSquareCheck;

	@Test
	void countPair() {
		int [] array = { 9, 0, 2, -5, 7 };

		Assertions.assertEquals(2, perfectSquareCheck.countPair(array));

	}
	@Test
	void countPair1() {
		int [] array = {9};

		Assertions.assertEquals(0, perfectSquareCheck.countPair(array));

	}
	@Test
	void countPair2() {
		int [] array = {11, 5, 4, 20};

		Assertions.assertEquals(3, perfectSquareCheck.countPair(array));

	}
}