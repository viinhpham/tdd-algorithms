package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/23/20
 */
class DaphneArrayTest extends AbstractTest {
	@InjectMocks
	DaphneArray daphneArray;
	@Test
	public void testCase1(){
		assertEquals(1,daphneArray.isDaphne(new int[]{2,4,2}));
	}
	@Test
	public void testCase2(){
		assertEquals(0,daphneArray.isDaphne(new int[]{2,3,2}));
	}
	@Test
	public void testCase3(){
		assertEquals(1,daphneArray.isDaphne(new int[]{1,3,5}));
	}

}