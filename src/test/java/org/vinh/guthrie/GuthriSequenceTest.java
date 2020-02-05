package org.vinh.guthrie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
class GuthriSequenceTest  extends AbstractTest {
	@InjectMocks
	GuthriSequence guthriSequence;

	@Test
	void isGuthriSequence() {
		int[] array = {8, 4, 2, 1};
		Assertions.assertTrue(guthriSequence.isGuthriSequence(array));
	}
	@Test
	void isGuthriSequence1() {
		int[] array = {8, 17, 4, 1};
		Assertions.assertFalse(guthriSequence.isGuthriSequence(array));
	}
	@Test
	void isGuthriSequence2() {
		int[] array = {8, 4, 2};
		Assertions.assertFalse(guthriSequence.isGuthriSequence(array));
	}
	@Test
	void isGuthriSequence3() {
		int[] array = {8, 4, 1};
		Assertions.assertFalse(guthriSequence.isGuthriSequence(array));
	}
	@Test
	void isGuthriSequence4() {
		int[] array = { 7, 22, 11, 34, 17, 52,
				26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1 };
		Assertions.assertTrue(guthriSequence.isGuthriSequence(array));
	}
	@Test
	void isGuthriSequence5() {
		int[] array = {1};
		Assertions.assertFalse(guthriSequence.isGuthriSequence(array));
	}
}