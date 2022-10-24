package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/28/20
 */
class PrimeProductTest extends AbstractTest{
	@InjectMocks
	PrimeProduct primeProduct;

	@Test
	public void testCase1(){
		assertEquals(1, primeProduct.isPrimeProduct(22));
	}
	@Test
	public void testCase2(){
		assertEquals(0, primeProduct.isPrimeProduct(20));
	}
	@Test
	public void testCase3(){
		assertEquals(0, primeProduct.isPrimeProduct(56));
	}

}