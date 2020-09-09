package org.vinh;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/30/20
 */
class MinDistanceTest extends AbstractTest {
	@InjectMocks
	MinDistance minDistance;

	@Test
	public void testCase1() {
		assertEquals(2, minDistance.minDistance(13013));
	}
	@Test
	public void testCase2() {
		assertEquals(1, minDistance.minDistance(8));
	}
	@Test
	public void testCase3() {
		assertEquals(0, minDistance.minDistance(0));
	}

}