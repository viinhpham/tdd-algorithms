package org.vinh.prime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

/**
 * Created by vinh.phamquoc on 1/3/20
 */
class PrimeCheckTest extends AbstractTest {
	@InjectMocks
	PrimeCheck primeCheck;

	@Test
	public void primeCountBetween10and30() {
		Assertions.assertEquals(6, primeCheck.primeCount(10, 30));
	}

	@Test
	public void primeCountBetween11and29() {
		Assertions.assertEquals(6, primeCheck.primeCount(11, 29));
	}

	@Test
	public void primeCountBetween20and22() {
		Assertions.assertEquals(0, primeCheck.primeCount(20, 22));
	}

	@Test
	public void primeCountBetween1and1() {
		Assertions.assertEquals(0, primeCheck.primeCount(1, 1));
	}

	@Test
	public void primeCountBetween5and5() {
		Assertions.assertEquals(1, primeCheck.primeCount(5, 5));
	}

	@Test
	public void primeCountBetween6and2() {
		Assertions.assertEquals(0, primeCheck.primeCount(6, 2));
	}

	@Test
	public void primeCountBetweenPositive10and6() {
		Assertions.assertEquals(3, primeCheck.primeCount(-10, 6));
	}
}