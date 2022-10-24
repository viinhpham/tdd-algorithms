package org.vinh.tdd.decodeArray;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/13/20
 */
class DecodeArrayTest extends AbstractTest {
	@InjectMocks
	DecodeArray decodeArray;

	@Test
	void decodeArray() {
		int[] array = {1};
		assertEquals(0, decodeArray.decodeArray(array));
	}
	@Test
	void decodeArray1() {
		int[] array = {0, 1};
		assertEquals(1, decodeArray.decodeArray(array));
	}
	@Test
	void decodeArray2() {
		int[] array = {-1, 0, 1};
		assertEquals(-1, decodeArray.decodeArray(array));
	}

	@Test
	void decodeArray3() {
		int[] array = {0, 1,1,1,1,1,0, 1};
		assertEquals(100001, decodeArray.decodeArray(array));
	}
	@Test
	void decodeArray4() {
		int[] array = {0, 0,0,0,0,0,0,0,0, 1,0, 0,0,0,0,0,0,0,0, 1,0, 0,0,0,0,0,0,0,0, 1};
		assertEquals(999, decodeArray.decodeArray(array));
	}
}