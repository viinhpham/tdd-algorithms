package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/30/20
 */
class WaveArrayTest extends AbstractTest {
	@InjectMocks
	WaveArray waveArray;

	@Test
	public void testCase1() {
		assertEquals(1, waveArray.isWaveArray(new int[]{7, 2, 9, 10, 5}));
	}

	@Test
	public void testCase2() {
		assertEquals(1, waveArray.isWaveArray(new int[]{4, 11, 12, 1, 6}));
	}

	@Test
	public void testCase3() {
		assertEquals(1, waveArray.isWaveArray(new int[]{1, 0, 5}));
	}

	@Test
	public void testCase4() {
		assertEquals(1, waveArray.isWaveArray(new int[]{2}));
	}
	@Test
	public void testCase5() {
		assertEquals(0, waveArray.isWaveArray(new int[]{2, 6, 3, 4}));
	}

}