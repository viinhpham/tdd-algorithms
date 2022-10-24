package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vinh.phamquoc on 9/9/20
 */
class NiceArray3Test extends AbstractTest {
	@InjectMocks
	NiceArray3 niceArray3;

	@Test
	public void testCase1(){
		assertEquals(1, niceArray3.isNiceArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
	}

	@Test
	public void testCase2(){
		assertEquals(1, niceArray3.isNiceArray(new int[]{13, 4, 4,4, 4}));
	}

	@Test
	public void testCase3(){
		assertEquals(1, niceArray3.isNiceArray(new int[]{3}));
	}

	@Test
	public void testCase4(){
		assertEquals(0, niceArray3.isNiceArray(new int[]{8, 5, -5, 5, 3}));
	}


}