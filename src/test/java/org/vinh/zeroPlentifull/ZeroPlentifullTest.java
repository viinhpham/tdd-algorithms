package org.vinh.zeroPlentifull;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/12/20
 */
class ZeroPlentifullTest extends AbstractTest {
	@InjectMocks
	ZeroPlentifull zeroPlentifull;

	@Test
	void isZeroPlentifull() {
		int[] array = {0, 0, 0, 0, 0};
		assertEquals(1, zeroPlentifull.isZeroPlentifull(array));
	}

	@Test
	void isZeroPlentifull1() {
		int[] array = {1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 12};
		assertEquals(2, zeroPlentifull.isZeroPlentifull(array));
	}

	@Test
	void isZeroPlentifull2() {
		int[] array = {0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
		assertEquals(3, zeroPlentifull.isZeroPlentifull(array));
	}

	@Test
	void isZeroPlentifull3() {
		int[] array = {1, 2, 3, 4};
		assertEquals(0, zeroPlentifull.isZeroPlentifull(array));
	}

	@Test
	void isZeroPlentifull4() {
		int[] array = {1, 0, 0, 0, 2, 0, 0, 0, 0};
		assertEquals(0, zeroPlentifull.isZeroPlentifull(array));
	}
	@Test
	void isZeroPlentifull5() {
		int[] array = {0};
		assertEquals(0, zeroPlentifull.isZeroPlentifull(array));
	}
	@Test
	void isZeroPlentifull6() {
		int[] array = {};
		assertEquals(0, zeroPlentifull.isZeroPlentifull(array));
	}

}