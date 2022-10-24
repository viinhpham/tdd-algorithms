package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vinh.phamquoc on 9/9/20
 */
class MeeraArray1Test extends AbstractTest {
	@InjectMocks
	MeeraArray1 meeraArray1;

	@Test
	public void testCase1(){
		assertEquals(1, meeraArray1.isMeera(new int[] {-4, 0, 1, 0, 2, 1}));

	}

	@Test
	public void testCase2(){
		assertEquals(0, meeraArray1.isMeera(new int[] {-8, 0, 0, 8, 0} ));

	}
	@Test
	public void testCase3(){
		assertEquals(0, meeraArray1.isMeera(new int[] {} ));

	}

	@Test
	public void testCase4(){
		assertEquals(0, meeraArray1.isMeera(new int[] {-8, 0, 0, 2, 0} ));

	}

}