package org.vinh.nUniqueArray;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/7/20
 */
class NUnitArrayTest extends AbstractTest {
	@InjectMocks
	NUnitArray nUnitArray;

	@Test
	void isNUnit() {
		int [] array = {7, 3, 3, 2, 4};
		assertFalse(nUnitArray.isNUnit(array, 6));

	}
	@Test
	void isNUnit1() {
		int [] array = {7, 3, 3, 2, 4};
		assertFalse(nUnitArray.isNUnit(array, 10));

	}
	@Test
	void isNUnit2() {
		int [] array = {7, 3, 3, 2, 4};
		assertTrue(nUnitArray.isNUnit(array, 11));

	}
	@Test
	void isNUnit3() {
		int [] array = {7, 3, 3, 2, 4};
		assertFalse(nUnitArray.isNUnit(array, 8));

	}
	@Test
	void isNUnit4() {
		int [] array = {7, 3, 3, 2, 4};
		assertFalse(nUnitArray.isNUnit(array, 4));

	}
	@Test
	void isNUnit5() {
		int [] array = {1};
		assertFalse(nUnitArray.isNUnit(array, 4));

	}
}