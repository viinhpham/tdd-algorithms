package org.vinh.tdd.porcupineNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
class PorcupineNumberCheckTest extends AbstractTest {
	@InjectMocks
	PorcupineNumberCheck porcupineNumberCheck;

	@Test
	void findPorcupineNumber() {
		Assertions.assertEquals(139, porcupineNumberCheck.findPorcupineNumber(0));
	}
	@Test
	void findPorcupineNumber1() {
		Assertions.assertEquals(139, porcupineNumberCheck.findPorcupineNumber(138));
	}
	@Test
	void findPorcupineNumber2() {
		Assertions.assertEquals(409, porcupineNumberCheck.findPorcupineNumber(139));
	}
}