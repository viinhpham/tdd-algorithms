package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vinh.phamquoc on 9/9/20
 */
class TrippleArrayTest extends AbstractTest {
	@InjectMocks
	TrippleArray trippleArray;

	@Test
	public void testCase1(){
		assertEquals(1, trippleArray.isTriple(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2}));
	}

	@Test
	public void testCase2(){
		assertEquals(0, trippleArray.isTriple(new int[]{2, 5, 2, 5, 5, 2, 5}));
	}

	@Test
	public void testCase3(){
		assertEquals(0, trippleArray.isTriple(new int[]{3, 1, 1, 1}));
	}


}