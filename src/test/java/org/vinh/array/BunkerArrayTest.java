package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/31/20
 */
class BunkerArrayTest extends AbstractTest {
	@InjectMocks
	BunkerArray bunkerArray;

	@Test
	public void testCase1() {
		assertEquals(1, bunkerArray.isBunker(new int[]{4, 9, 6, 7, 3}));
	}
	@Test
	public void testCase2() {
		assertEquals(0, bunkerArray.isBunker(new int[]{4, 9, 6, 15, 21}));
	}
	@Test
	public void testCase3() {
		assertEquals(0, bunkerArray.isBunker(new int[]{}));
	}

	@Test
	public void testCase4() {
		assertEquals(0, bunkerArray.isBunker(new int[]{3}));
	}

}