package org.vinh;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/26/20
 */
class DigitSumTest extends AbstractTest{
	@InjectMocks
	DigitSum digitSum;
	@Test
	public void testCase1(){
		assertEquals(1,digitSum.isDigitSum(-1, 1));
	}
	@Test
	public void testCase2(){
		assertEquals(0, digitSum.isDigitSum(32121,9));
	}
	@Test
	public void testCase3(){
		assertEquals(1, digitSum.isDigitSum(13, 6));
	}
	@Test
	public void testCase4(){
		assertEquals(0, digitSum.isDigitSum(3,3));
	}
	@Test
	public void testCase5(){
		assertEquals(1, digitSum.isDigitSum(1000,3));
	}

	@Test
	public void testCase6(){
		assertEquals(1, digitSum.isDigitSum(32121,10));
	}

}