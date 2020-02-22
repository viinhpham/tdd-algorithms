package org.vinh.hasNValues;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/22/20
 */
class HasNValuesTest extends AbstractTest{

	@InjectMocks
	HasNValues hasNValues;

	@Test
	void hasNValues() {

		assertEquals(1, hasNValues.hasNValues(new int[]{1, 2, 2, 1}, 2));
	}
	@Test
	void hasNValues1() {

		assertEquals(1, hasNValues.hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
	}
	@Test
	void hasNValues2() {

		assertEquals(1, hasNValues.hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
	}
	@Test
	void hasNValues3() {

		assertEquals(0, hasNValues.hasNValues(new int[]{1, 2, 2, 1}, 3));
	}
	@Test
	void hasNValues4() {

		assertEquals(0, hasNValues.hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
	}
	@Test
	void hasNValues5() {

		assertEquals(0, hasNValues.hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
	}

}