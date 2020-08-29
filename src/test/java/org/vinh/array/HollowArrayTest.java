package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/29/20
 */
class HollowArrayTest extends AbstractTest {
	@InjectMocks
	HollowArray hollowArray;

	@Test
	public void testCase1(){
		assertEquals(1, hollowArray.isHollow(new int[]{1,2,4,0,0,0,3,4,5}));
	}
	@Test
	public void testCase2(){
		assertEquals(0, hollowArray.isHollow(new int[]{1,2,0,0,0,3,4,5}));
	}
	@Test
	public void testCase3(){
		assertEquals(0, hollowArray.isHollow(new int[]{1,2,4,9, 0,0,0,3,4, 5}));
	}
	@Test
	public void testCase4(){
		assertEquals(0, hollowArray.isHollow(new int[]{1,2, 0,0, 3,4}));
	}


}