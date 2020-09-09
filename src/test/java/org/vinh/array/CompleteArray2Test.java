package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 9/6/20
 */
class CompleteArray2Test extends AbstractTest {
	@InjectMocks
	CompleteArray2 completeArray;

	@Test
	public void testCase1(){
		assertEquals(1, completeArray.isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
	}
	@Test
	public void testCase2(){
		assertEquals(0, completeArray.isComplete(new int[]{2, 3, 3, 6}));
	}

	@Test
	public void testCase3(){
		assertEquals(0, completeArray.isComplete(new int[]{2, -3, 4, 3, 6}));
	}


}