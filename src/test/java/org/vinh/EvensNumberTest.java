package org.vinh;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/27/20
 */
class EvensNumberTest extends AbstractTest{
	@InjectMocks
	EvensNumber evensNumber;
	@Test
	public void testCase1(){
		assertEquals(1, evensNumber.isEvens(4224));
	}
	@Test
	public void testCase2(){
		assertEquals(0, evensNumber.isEvens(3224));
	}
	@Test
	public void testCase3(){
		assertEquals(1, evensNumber.isEvens(0));
	}

}