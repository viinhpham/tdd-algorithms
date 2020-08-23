package org.vinh.array;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 8/23/20
 */
class ArrayValenTest extends AbstractTest {
	@InjectMocks
	ArrayValen arrayValen;
	@Test
	public void testCase1(){
		assertEquals(1, arrayValen.isOddValen(new int[]{9, 3, 4, 9, 1}));
	}
	@Test
	public void testCase2(){
		assertEquals(1, arrayValen.isOddValen(new int[]{3, 3, 3, 3}));
	}
	@Test
	public void testCase3(){
		assertEquals(0, arrayValen.isOddValen(new int[]{1, 2, 3, 4, 5}));
	}

}