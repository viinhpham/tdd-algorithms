package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Vinh Pham.
 * Date: 12/19/22.
 * Time : 9:08 PM.
 */
class QuickSortTest extends AbstractTest{
	@InjectMocks
	QuickSort quickSort;

	@Test
	void testQuickSort(){
		int[] array = {1, 3, 2, 5, 4};
		int[] expected = {1, 2, 3, 4, 5};
		quickSort.sort(array);
		assertArrayEquals(expected, array);
	}

}