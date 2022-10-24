package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/29/20
 */
class KSmallFactorsTest extends AbstractTest{
	@InjectMocks
	KSmallFactors kSmallFactors;

	@Test
	public void testCase1() {
		assertEquals(1, kSmallFactors.hasKSmallFactors(10, 20));
	}
	@Test
	public void testCase2() {
		assertEquals(0, kSmallFactors.hasKSmallFactors(12, 1));
	}
	@Test
	public void testCase3() {
		assertEquals(1, kSmallFactors.hasKSmallFactors(6, 20));
	}
	@Test
	public void testCase4() {
		assertEquals(0, kSmallFactors.hasKSmallFactors(10, 22));
	}

}