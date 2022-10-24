package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/31/20
 */
class CountDigitTest extends AbstractTest{
	@InjectMocks
	CountDigit countDigit;

	@Test
	public void testCase1(){
		assertEquals(2, countDigit.countDigit(32121, 1) );
	}
	@Test
	public void testCase2(){
		assertEquals(4, countDigit.countDigit(33331, 3) );
	}
	@Test
	public void testCase3(){
		assertEquals(0, countDigit.countDigit(33331, 6) );
	}
	@Test
	public void testCase4(){
		assertEquals(1, countDigit.countDigit(3, 3));
	}
	@Test
	public void testCase5(){
		assertEquals(-1, countDigit.countDigit(-543, 3) );
	}

}