package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/24/20
 */
class NormalNumberTest extends AbstractTest{
	@InjectMocks
	NormalNumber normalNumber;
	@Test
	public void testCase1(){
		assertEquals(1, normalNumber.isNormal(1));
	}
	@Test
	public void testCase2(){
		assertEquals(1, normalNumber.isNormal(2));
	}
	@Test
	public void testCase3(){
		assertEquals(0, normalNumber.isNormal(6));
	}
	@Test
	public void testCase4(){
		assertEquals(0, normalNumber.isNormal(9));
	}
	@Test
	public void testCase5(){
		assertEquals(1, normalNumber.isNormal(7));
	}
	@Test
	public void testCase6(){
		assertEquals(0, normalNumber.isNormal(49));
	}

}