package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 9/5/20
 */
class TrailingZeroesFactorialTest extends AbstractTest{
	@InjectMocks
	TrailingZeroesFactorial trailingZeroesFactorial;

	@Test
	public void testCase1(){
		assertEquals(24, trailingZeroesFactorial.countTrailingZeros(100));
	}

}