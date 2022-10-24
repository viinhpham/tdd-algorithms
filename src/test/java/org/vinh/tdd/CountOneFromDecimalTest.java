package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/22/20
 */
class CountOneFromDecimalTest extends AbstractTest{
	@InjectMocks
	CountOneFromDecimal countOneFromDecimal;
	@Test
	public void testCase1(){
		assertEquals(2, countOneFromDecimal.countOne(9));
	}
	@Test
	public void testCase2(){
		assertEquals(2, countOneFromDecimal.countOne(5));
	}
	@Test
	public void testCase3(){
		assertEquals(4, countOneFromDecimal.countOne(15));
	}


}