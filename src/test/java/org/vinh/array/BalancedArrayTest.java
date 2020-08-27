package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/27/20
 */
class BalancedArrayTest extends AbstractTest {
	@InjectMocks
	BalancedArray balancedArray;
	@Test
	public void testCase1(){
		assertEquals(1, balancedArray.isBalance(new int[] {1,-1,-1, 1}));
	}
	@Test
	public void testCase2(){
		assertEquals(0, balancedArray.isBalance(new int[] {-1, -1, 1}));
	}

}