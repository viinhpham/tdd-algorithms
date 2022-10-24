package org.vinh.tdd.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vinh.phamquoc on 9/10/20
 */
class DuplicateRemovalTest extends AbstractTest {
	@InjectMocks
	DuplicateRemoval duplicateRemoval;

	@Test
	public void testCase1(){
		assertEquals(2, duplicateRemoval.removeDuplicate(new int[]{1,1,2}));
	}

	@Test
	public void testCase2(){
		assertEquals(5, duplicateRemoval.removeDuplicate(new int[]{0,0,0,1,1,2,2,3,3,4}));
	}

}