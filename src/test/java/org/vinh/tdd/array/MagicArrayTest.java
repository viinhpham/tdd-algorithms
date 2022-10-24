package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/28/20
 */
class MagicArrayTest extends AbstractTest {
	@InjectMocks
	MagicArray magicArray;
	@Test
	public void testCase1(){
		assertEquals(1, magicArray.isMagicArray(new int[] {21, 3, 7, 9, 11, 4, 6}));
	}
	@Test
	public void testCase2(){
		assertEquals(1, magicArray.isMagicArray(new int[] {13, 4, 4, 4, 4}));
	}
	@Test
	public void testCase4(){
		assertEquals(1, magicArray.isMagicArray(new int[] {0, 6, 8, 20}));
	}
	@Test
	public void testCase5(){
		assertEquals(0, magicArray.isMagicArray(new int[] {4}));
	}

}