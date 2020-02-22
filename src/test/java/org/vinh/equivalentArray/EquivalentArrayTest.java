package org.vinh.equivalentArray;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/22/20
 */
class EquivalentArrayTest extends AbstractTest {
	@InjectMocks
	EquivalentArray equivalentArray;

	@Test
	void equivalentArrays() {
		assertEquals(1, equivalentArray.equivalentArrays(new int[]{0, 1, 2}, new int[]{2, 0, 1}));
	}
	@Test
	void equivalentArrays1() {
		assertEquals(1, equivalentArray.equivalentArrays(new int[]{0, 1, 2, 1}, new int[]{2, 0, 1}));
	}
	@Test
	void equivalentArrays2() {
		assertEquals(1, equivalentArray.equivalentArrays(new int[]{2, 0, 1}, new int[]{0, 1, 2, 1}));
	}
	@Test
	void equivalentArrays3() {
		assertEquals(1, equivalentArray.equivalentArrays(new int[]{0, 5, 5, 5, 1, 2, 1}, new int[]{5, 2, 0, 1}));
	}
	@Test
	void equivalentArrays4() {
		assertEquals(1, equivalentArray.equivalentArrays(new int[]{5, 2, 0, 1}, new int[]{0, 5, 5, 5, 1, 2, 1}));
	}
	@Test
	void equivalentArrays5() {
		assertEquals(0, equivalentArray.equivalentArrays(new int[]{0, 2, 1, 2}, new int[]{3, 1, 2, 0}));
	}
	@Test
	void equivalentArrays6() {
		assertEquals(0, equivalentArray.equivalentArrays(new int[]{3, 1, 2, 0}, new int[]{0, 2, 1, 0}));
	}
	@Test
	void equivalentArrays7() {
		assertEquals(0, equivalentArray.equivalentArrays(new int[]{1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 2}));
	}
	@Test
	void equivalentArrays8() {
		assertEquals(0, equivalentArray.equivalentArrays(new int[]{}, new int[]{3, 1, 1, 1, 1, 2}));
	}
	@Test
	void equivalentArrays9() {
		assertEquals(1, equivalentArray.equivalentArrays(new int[]{}, new int[]{}));
	}

}