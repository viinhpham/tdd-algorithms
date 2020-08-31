package org.vinh;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/31/20
 */
class MeeraNumberTest extends AbstractTest{
	@InjectMocks
	MeeraNumber meeraNumber;

	@Test
	public void testCase1(){
		assertEquals(1, meeraNumber.isMeeraNumber(6));

	}

	@Test
	public void testCase2(){
		assertEquals(1, meeraNumber.isMeeraNumber(30));

	}

	@Test
	public void testCase3(){
		assertEquals(0, meeraNumber.isMeeraNumber(21));

	}

}