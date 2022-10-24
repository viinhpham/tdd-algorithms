package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/22/20
 */
class PerfectArrayTest extends AbstractTest {
	@InjectMocks
	PerfectArray perfectArray;
	@Test
	public void testCase1(){
		assertTrue(perfectArray.isPerfectArray(new int[]{12,2,10}));
	}
	@Test
	public void testCase2(){
		assertFalse(perfectArray.isPerfectArray(new int[]{5,2,1}));
	}
	@Test
	public void testCase3(){
		assertFalse(perfectArray.isPerfectArray(new int[]{}));
	}
	@Test
	public void testCase4(){
		assertTrue(perfectArray.isPerfectArray(new int[]{1}));
	}

}