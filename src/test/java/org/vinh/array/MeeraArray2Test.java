package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vinh.phamquoc on 9/10/20
 */
class MeeraArray2Test extends AbstractTest {
	@InjectMocks
	MeeraArray2 meeraArray2;

	@Test
	public void testCase1(){
		assertEquals(1, meeraArray2.isMeeraArray(new int[] {7, 6, 0, 10, 1}));
	}

	@Test
	public void testCase2(){
		assertEquals(1, meeraArray2.isMeeraArray(new int[] {6, 10, 1}));
	}

	@Test
	public void testCase3(){
		assertEquals(0, meeraArray2.isMeeraArray(new int[] {7, 6, 10}));
	}

	@Test
	public void testCase4(){
		assertEquals(0, meeraArray2.isMeeraArray(new int[] {6, 10, 0}));
	}

	@Test
	public void testCase5(){
		assertEquals(1, meeraArray2.isMeeraArray(new int[] {3, 7, 0, 8, 0, 5}));
	}


}