package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/27/20
 */
class FineArrayTest extends AbstractTest {
	@InjectMocks
	FineArray fineArray;
	@Test
	public void testCase1(){
		assertEquals(1, fineArray.isFine(new int[] {4, 7, 9, 6, 5}));
	}

	@Test
	public void testCase2(){
		assertEquals(1, fineArray.isFine(new int[] {4, 9, 6, 33}));
	}

	@Test
	public void testCase3(){
		assertEquals(0, fineArray.isFine(new int[] {3, 8, 15}));
	}

}