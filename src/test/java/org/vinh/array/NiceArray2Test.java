package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 9/2/20
 */
class NiceArray2Test extends AbstractTest {
	@InjectMocks
	NiceArray2 niceArray2;

	@Test
	public void testCase1(){
		assertEquals(1, niceArray2.isNiceArray(new int[] {2, 10, 9, 3}));
	}

	@Test
	public void testCase2(){
		assertEquals(1, niceArray2.isNiceArray(new int[] {2, 2, 3, 3, 3}));
	}

	@Test
	public void testCase3(){
		assertEquals(1, niceArray2.isNiceArray(new int[]  {0, -1, 1}));
	}
	@Test
	public void testCase4(){
		assertEquals(1, niceArray2.isNiceArray(new int[]  {1, 1, 1, 2, 1, 1}));
	}
	@Test
	public void testCase5(){
		assertEquals(0, niceArray2.isNiceArray(new int[]  {3, 4, 5, 7}));
	}

}