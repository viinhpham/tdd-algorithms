package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/28/20
 */
class BalanceArrayV2Test extends AbstractTest {
	@InjectMocks
	BalanceArrayV2 balanceArrayV2;

	@Test
	public void testCase1(){
		assertEquals(1, balanceArrayV2.isBalance(new int[]{2, 23, 6, 7}));
	}
	@Test
	public void testCase(){
		assertEquals(1, balanceArrayV2.isBalance(new int[]{6, 7, 2, 3, 12}));
	}
	@Test
	public void testCase3(){
		assertEquals(0, balanceArrayV2.isBalance(new int[]{7, 15, 2, 3}));
	}
	@Test
	public void testCase4(){
		assertEquals(0, balanceArrayV2.isBalance(new int[]{16, 6, 2, 3}));
	}

}