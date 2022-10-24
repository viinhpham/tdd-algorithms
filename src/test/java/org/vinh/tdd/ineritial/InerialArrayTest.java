package org.vinh.tdd.ineritial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

/**
 * Created by vinh.phamquoc on 1/14/20
 */

class InerialArrayTest extends AbstractTest {
	@InjectMocks
	private InerialArray inerialArray;

	@Test
	void isInerialArray() {
		int[] array =  { 1 };
		Assertions.assertFalse(inerialArray.isInerialArray(array));

	}
	@Test
	void isInerialArray2() {
		int[] array =  { 2 };
		Assertions.assertFalse(inerialArray.isInerialArray(array));

	}

	@Test
	void isInerialArray3() {
		int[] array =  { 1, 2, 3, 4 };
		Assertions.assertFalse(inerialArray.isInerialArray(array));

	}
	@Test
	void isInerialArray4() {
		int[] array =  { 1, 1, 1, 1, 1, 1, 2 };
		Assertions.assertTrue(inerialArray.isInerialArray(array));

	}
	@Test
	void isInerialArray5() {
		int[] array =  { 2, 12, 4, 6, 8, 11 };
		Assertions.assertTrue(inerialArray.isInerialArray(array));

	}
	@Test
	void isInerialArray6() {
		int[] array =  { 2, 12, 12, 4, 6, 8, 11 };
		Assertions.assertTrue(inerialArray.isInerialArray(array));

	}

	@Test
	void isInerialArray7() {
		int[] array =  { -2, -4, -6, -8, -11 };
		Assertions.assertFalse(inerialArray.isInerialArray(array));

	}
	@Test
	void isInerialArray8() {
		int[] array =  {2, 3, 5, 7};
		Assertions.assertFalse(inerialArray.isInerialArray(array));

	}
	@Test
	void isInerialArray9() {
		int[] array =  {2, 4, 6, 8, 10};
		Assertions.assertFalse(inerialArray.isInerialArray(array));

	}
}