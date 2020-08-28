package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/29/20
 */
class CenteredOddArrayTest extends AbstractTest {
	@InjectMocks
	CenteredOddArray centeredOddArray;

	@Test
	public void testCase1(){
		assertEquals(1, centeredOddArray.isCenteredOdd(new int[]{3, 2, 1, 4, 5}));
	}
	@Test
	public void testCase2(){
		assertEquals(0, centeredOddArray.isCenteredOdd(new int[]{5, 3, 3, 4, 5}));
	}
	@Test
	public void testCase3(){
		assertEquals(0, centeredOddArray.isCenteredOdd(new int[]{3, 2, 1, 4, 1}));
	}
	@Test
	public void testCase4(){
		assertEquals(0, centeredOddArray.isCenteredOdd(new int[]{3, 2, 1, 1, 4, 6}));
	}
	@Test
	public void testCase5(){
		assertEquals(0, centeredOddArray.isCenteredOdd(new int[]{}));
	}

}