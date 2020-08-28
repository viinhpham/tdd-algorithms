package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/28/20
 */
class CompleteArrayTest extends AbstractTest {
	@InjectMocks
	CompleteArray completeArray;

	@Test
	public void testCase1() {
		assertEquals(1, completeArray.isCompleteArray(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
	}
	@Test
	public void testCase2() {
		assertEquals(0, completeArray.isCompleteArray(new int[]{5, 7, 9, 13}));
	}
	@Test
	public void testCase3() {
		assertEquals(0, completeArray.isCompleteArray(new int[] {2, 2}));
	}
	@Test
	public void testCase4() {
		assertEquals(0, completeArray.isCompleteArray(new int[] {2, 6, 3, 4}));
	}

}