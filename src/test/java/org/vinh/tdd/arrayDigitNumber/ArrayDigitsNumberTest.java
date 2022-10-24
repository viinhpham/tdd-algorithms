package org.vinh.tdd.arrayDigitNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
class ArrayDigitsNumberTest extends AbstractTest {
	@InjectMocks
	ArrayDigitsNumber arrayDigitsNumber;

	@Test
	void resqEqual() {
		int[] array = {3, 2, 0, 5, 3};
		Assertions.assertTrue(arrayDigitsNumber.resqEqual(array, 32053));
	}

	@Test
	void resqEqual1() {
		int[] array = {3, 2, 0, 5};
		Assertions.assertFalse(arrayDigitsNumber.resqEqual(array, 32053));
	}

	@Test
	void resqEqual2() {
		int[] array = {3, 2, 0, 5, 3, 4};
		Assertions.assertFalse(arrayDigitsNumber.resqEqual(array, 32053));
	}

	@Test
	void resqEqual3() {
		int[] array = {2, 3, 0, 5, 3};
		Assertions.assertFalse(arrayDigitsNumber.resqEqual(array, 32053));
	}

	@Test
	void resqEqual4() {
		int[] array = {9, 3, 1, 1, 2};
		Assertions.assertFalse(arrayDigitsNumber.resqEqual(array, 32053));
	}

	@Test
	void resqEqual5() {
		int[] array = {0, 3, 2, 0, 5, 3};
		Assertions.assertTrue(arrayDigitsNumber.resqEqual(array, 32053));
	}
}