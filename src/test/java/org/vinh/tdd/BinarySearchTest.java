package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Vinh Pham.
 * Date: 12/24/22.
 * Time : 9:24 PM.
 */
class BinarySearchTest extends AbstractTest{
	@InjectMocks
	BinarySearch binarySearch;

	@Test
	void searchWithRecursive() {
		int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertEquals(8, binarySearch.search(array, 9, true));
	}

	@Test
	void searchWithoutRecursive() {
		int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertEquals(8, binarySearch.search(array, 9, false));
	}

}