package org.vinh.sumFactor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
class SumFactorTest extends AbstractTest {
	@InjectMocks
	SumFactor sumFactor;

	@Test
	void sumFactor() {
		int[] array = {3, 0, 2, -5, 0};
		Assertions.assertEquals(2, sumFactor.sumFactor(array));
	}

	@Test
	void sumFactor1() {
		int[] array = {9, -3, -3, -1, -1};
		Assertions.assertEquals(0, sumFactor.sumFactor(array));
	}

	@Test
	void sumFactor2() {
		int[] array = {1};
		Assertions.assertEquals(1, sumFactor.sumFactor(array));
	}

	@Test
	void sumFactor3() {
		int[] array = {0, 0, 0};
		Assertions.assertEquals(3, sumFactor.sumFactor(array));
	}

	@Test
	void sumFactor4() {
		int[] array = {1, -1, 1, -1, 1, -1, 1};
		Assertions.assertEquals(4, sumFactor.sumFactor(array));
	}
}