package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/29/20
 */
class ArrayFillingTest extends AbstractTest {
	@InjectMocks
	ArrayFilling arrayFilling;

	@Test
	public void testCase1(){
		assertArrayEquals(new int[]{1,2,3,1,2,3,1,2,3,1}, arrayFilling.fill(new int[]{1,2,3,5, 9, 12,-2,-1},3,10));
	}
	@Test
	public void testCase2(){
		assertArrayEquals(new int[]{4, 4, 4, 4, 4}, arrayFilling.fill(new int[]{4, 2, -3, 12}, 1, 5));
	}
	@Test
	public void testCase3(){
		assertArrayEquals(null , arrayFilling.fill(new int[]{2, 6, 9, 0, -3}, 0, 4));
	}

}