package org.vinh.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/21/20
 */
class NiceArrayTest extends AbstractTest {
	@InjectMocks
	NiceArray niceArray;

	@Test
	public void testCase1(){
		Assertions.assertTrue(niceArray.isNiceArray(new int[]{5,13,11,2,4}));
	}
	@Test
	public void testCase2(){
		Assertions.assertTrue(niceArray.isNiceArray(new int[]{5,13,2,3,5,13}));
	}
	@Test
	public void testCase3(){
		Assertions.assertFalse(niceArray.isNiceArray(new int[]{5,13,2,13,5,63}));
	}
	@Test
	public void testCase4(){
		Assertions.assertTrue(niceArray.isNiceArray(new int[]{5,13,11,2,4}));
	}

	@Test
	public void testCase5(){
		Assertions.assertTrue(niceArray.isNiceArray(new int[]{13,11,2,4}));
	}
	@Test
	public void testCase6(){
		Assertions.assertFalse(niceArray.isNiceArray(new int[]{13,5}));
	}



}