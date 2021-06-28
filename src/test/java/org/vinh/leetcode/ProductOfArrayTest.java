package org.vinh.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Vinh Pham.
 * Date: 08/06/2021.
 * Time : 15:01.
 */
class ProductOfArrayTest extends AbstractTest {
	@InjectMocks
	private ProductOfArray productOfArray;
	@Test
	public void testCorrectResult(){
		int[] result =  productOfArray.productOfArray(new int[]{1,2,3,4});
		Assertions.assertArrayEquals(result, new int[]{24, 12, 8, 6});
	}

}