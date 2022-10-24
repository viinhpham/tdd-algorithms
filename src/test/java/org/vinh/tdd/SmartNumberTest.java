package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vinh.phamquoc on 9/9/20
 */
class SmartNumberTest extends AbstractTest{
	@InjectMocks
	SmartNumber smartNumber;

	@Test
	public void testCase1(){
		assertEquals(1, smartNumber.isSmart(11));
	}

	@Test
	public void testCase2(){
		assertEquals(1, smartNumber.isSmart(22));
	}

	@Test
	public void testCase3(){
		assertEquals(0, smartNumber.isSmart(8));
	}

}