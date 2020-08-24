package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/24/20
 */
class AllPossibilitiesTest extends AbstractTest {
	@InjectMocks
	AllPossibilities allPossibilities;
	@Test
	public void testCase1(){
		assertEquals(1, allPossibilities.isAllPossibilities(new int[]{1,2,0,3}));
	}
	@Test
	public void testCase2(){
		assertEquals(0, allPossibilities.isAllPossibilities(new int[]{1,1,1,3}));
	}
	@Test
	public void testCase3(){
		assertEquals(0, allPossibilities.isAllPossibilities(new int[]{1,2,4,3}));
	}
	@Test
	public void testCase4(){
		assertEquals(0, allPossibilities.isAllPossibilities(new int[]{1,2,4}));
	}
	@Test
	public void testCase5(){
		assertEquals(1, allPossibilities.isAllPossibilities(new int[]{0}));
	}

}