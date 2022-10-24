package org.vinh.tdd.digitIncreasing;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/13/20
 */
class DigitIncreasingTest extends AbstractTest {
	@InjectMocks
	DigitIncreasing digitIncreasing;


	@Test
	void isDigitIncreasing() {
		assertTrue(digitIncreasing.isDigitIncreasing(7));

	}
	@Test
	void isDigitIncreasing1() {
		assertTrue(digitIncreasing.isDigitIncreasing(36));

	}
	@Test
	void isDigitIncreasing2() {
		assertTrue(digitIncreasing.isDigitIncreasing(984));

	}

	@Test
	void isDigitIncreasing4() {
		assertTrue(digitIncreasing.isDigitIncreasing(7404));

	}
}