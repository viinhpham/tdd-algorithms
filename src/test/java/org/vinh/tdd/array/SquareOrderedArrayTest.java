package org.vinh.tdd.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import java.util.Arrays;

/**
 * Created by vinh.phamquoc on 6/9/20
 */

class SquareOrderedArrayTest extends AbstractTest {
	@InjectMocks
	SquareOrderedArray squareOrderedArray;

	@Test
	void squareOrderedArray() {
		Assertions.assertTrue(Arrays.equals(new int[]{1, 4, 9, 16}, squareOrderedArray.squareOrderedArray(new int[]{1, 2, 3, 4})));
	}

	@Test
	void squareOrderedArrayWithNegativeNumber() {
		Assertions.assertTrue(Arrays.equals(new int[]{1, 9, 16, 25}, squareOrderedArray.squareOrderedArray(new int[]{-4, 1, 3, 5})));
	}

	@Test
	void squareOrderedArrayWithNegativeNumber1() {
		Assertions.assertTrue(Arrays.equals(new int[]{1, 4, 9, 16, 25}, squareOrderedArray.squareOrderedArray(new int[]{-4, -2, 1, 3, 5})));
	}
}