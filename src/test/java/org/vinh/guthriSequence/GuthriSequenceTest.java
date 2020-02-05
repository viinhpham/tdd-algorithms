package org.vinh.guthriSequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

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
}