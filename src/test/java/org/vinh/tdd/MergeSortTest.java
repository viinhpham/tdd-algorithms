package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Vinh Pham.
 * Date: 12/16/22.
 * Time : 10:27 PM.
 */
class MergeSortTest extends AbstractTest {
	@InjectMocks
	MergeSort mergeSort;

@Test
void testMergeSort() {
	int[] array = {1, 3, 2, 5, 4};
	int[] expected = {1, 2, 3, 4, 5};
	mergeSort.sort(array);
	assertArrayEquals(expected, array);
   }
}
