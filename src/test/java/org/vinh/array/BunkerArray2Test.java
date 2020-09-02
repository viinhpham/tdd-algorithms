package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 9/2/20
 */
class BunkerArray2Test extends AbstractTest {
	@InjectMocks
	BunkerArray2 bunkerArray2;

	@Test
	public void testCase1() {
		assertEquals(1, bunkerArray2.isBunkerArray(new int[]{7, 6, 10, 1} ));
	}

	@Test
	public void testCase2() {
		assertEquals(0, bunkerArray2.isBunkerArray(new int[]{7, 6, 10} ));
	}

	@Test
	public void testCase3() {
		assertEquals(0, bunkerArray2.isBunkerArray(new int[]{6, 10, 1}));
	}

	@Test
	public void testCase4() {
		assertEquals(1, bunkerArray2.isBunkerArray(new int[]{3, 7, 1, 8, 1}));
	}

}