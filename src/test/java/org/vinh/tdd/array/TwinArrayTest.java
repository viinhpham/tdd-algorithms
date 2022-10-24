package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 9/4/20
 */
class TwinArrayTest extends AbstractTest {
	@InjectMocks
	TwinArray twinArray;

	@Test
	public void testCase1(){
		assertEquals(1, twinArray.isTwin(new int[]{3, 5, 8, 10, 27}));

	}
	@Test
	public void testCase2(){
		assertEquals(1, twinArray.isTwin(new int[]{11, 9, 12, 13, 23}));

	}
	@Test
	public void testCase3(){
		assertEquals(1, twinArray.isTwin(new int[]{5, 3, 14, 7, 18, 67}));

	}

	@Test
	public void testCase4(){
		assertEquals(0, twinArray.isTwin(new int[]{13, 14, 15, 3, 5}));

	}

	@Test
	public void testCase5(){
		assertEquals(0, twinArray.isTwin(new int[]{1, 17, 8, 25, 67}));

	}

}