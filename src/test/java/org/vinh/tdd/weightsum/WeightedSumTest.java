package org.vinh.tdd.weightsum;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/22/20
 */
class WeightedSumTest extends AbstractTest {
	@InjectMocks
	WeightedSum weightedSum;

	@Test
	void computeWeightedSum() {
		assertEquals(39, weightedSum.computeWeightedSum(new int[]{1, 2, 3, 4, 5}));
	}
	@Test
	void computeWeightedSum1() {
		assertEquals(27, weightedSum.computeWeightedSum(new int[]{1, 3, 5}));
	}
	@Test
	void computeWeightedSum2() {
		assertEquals(24, weightedSum.computeWeightedSum(new int[]{2, 4, 6}));
	}
	@Test
	void computeWeightedSum3() {
		assertEquals(3, weightedSum.computeWeightedSum(new int[]{1}));
	}
	@Test
	void computeWeightedSum4() {
		assertEquals(4, weightedSum.computeWeightedSum(new int[]{2}));
	}
	@Test
	void computeWeightedSum5() {
		assertEquals(0, weightedSum.computeWeightedSum(new int[]{0, 0, 0, 0, 0}));
	}

}