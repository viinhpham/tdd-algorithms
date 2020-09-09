package org.vinh;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vinh.phamquoc on 9/9/20
 */
class FibonaciTest extends AbstractTest{
	@InjectMocks
	private Fibonaci fibonaci;
	@Test
	public void testCase1(){
		assertEquals(1, fibonaci.isFibonacci(8));

	}

	@Test
	public void testCase2(){
		assertEquals(0, fibonaci.isFibonacci(9));

	}



}