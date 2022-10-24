package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vinh.phamquoc on 9/9/20
 */
class FactorEqualTest extends AbstractTest{
	@InjectMocks
	FactorEqual factorEqual;
	@Test
	public void testCase1(){
		assertEquals(1, factorEqual.factorEqual(10, 33));
	}
	@Test
	public void testCase2(){
		assertEquals(0, factorEqual.factorEqual(9, 10));
	}

}