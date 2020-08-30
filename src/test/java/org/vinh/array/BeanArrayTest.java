package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/30/20
 */
class BeanArrayTest extends AbstractTest {
	@InjectMocks
	BeanArray beanArray;

	@Test
	public void testCase1(){
		assertEquals(1, beanArray.isBean(new int[]{1, 2, 3, 9, 6, 13}));
	}
	@Test
	public void testCase2(){
		assertEquals(1, beanArray.isBean(new int[]{3, 4, 6, 7, 13, 15}));
	}
	@Test
	public void testCase3(){
		assertEquals(1, beanArray.isBean(new int[]{1, 2, 3, 4, 10, 11, 12}));
	}
	@Test
	public void testCase4(){
		assertEquals(1, beanArray.isBean(new int[] {3, 6, 9, 5, 7, 13, 6, 17}));
	}
	@Test
	public void testCase5(){
		assertEquals(0, beanArray.isBean(new int[] { 9, 6, 18}));
	}
	@Test
	public void testCase6(){
		assertEquals(0, beanArray.isBean(new int[] {4, 7, 16}));
	}

}