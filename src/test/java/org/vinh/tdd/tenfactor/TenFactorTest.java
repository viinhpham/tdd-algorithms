package org.vinh.tdd.tenfactor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
class TenFactorTest extends AbstractTest {
	@InjectMocks
	TenFactor tenFactor;

	@Test
	void solve10() {
		int[] result = tenFactor.solve10();
		Assertions.assertEquals(0, result[0]);
		Assertions.assertEquals(0, result[1]);

	}
}