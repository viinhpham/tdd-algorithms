package org.vinh.perfectNumber;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/6/20
 */
class PerfectNumberTest extends AbstractTest {
	@InjectMocks
	PerfectNumber perfectNumber;


	@Test
	void testHenry() {
		assertEquals(34, perfectNumber.henry(1,2));
	}
	@Test
	void testHenry1() {
		assertEquals(502, perfectNumber.henry(1,3));
	}

	@Test
	void testHenry3() {
		assertEquals(502, perfectNumber.henry(3,1));
	}
}