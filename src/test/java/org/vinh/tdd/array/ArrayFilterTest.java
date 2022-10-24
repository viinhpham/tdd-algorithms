package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/25/20
 */
class ArrayFilterTest extends AbstractTest {
	@InjectMocks
	ArrayFilter arrayFilter;
	@Test
	public  void testCase1(){
		assertEquals(1, arrayFilter.isFilter(new int[]{1, 2, 3, 9, 6, 11}));
	}
	@Test
	public  void testCase2(){
		assertEquals(1, arrayFilter.isFilter(new int[]{3, 4, 6, 7, 14, 16}));
	}
	@Test
	public  void testCase3(){
		assertEquals(1, arrayFilter.isFilter(new int[]{3, 4, 6, 7, 14, 16}));
	}
	@Test
	public  void testCase4(){
		assertEquals(0, arrayFilter.isFilter(new int[]{9, 6, 18}));
	}
	@Test
	public  void testCase5(){
		assertEquals(0, arrayFilter.isFilter(new int[]{4, 7, 13}));
	}
	@Test
	public  void testCase6(){
		assertEquals(1, arrayFilter.isFilter(new int[]{4, 9, 11, 7}));
	}
	@Test
	public  void testCase7(){
		assertEquals(1, arrayFilter.isFilter(new int[]{4, 9, 11, 13}));
	}


}