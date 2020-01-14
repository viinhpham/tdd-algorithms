package org.vinh.mahav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 1/8/20
 */
class MahavArrayCheckTest extends AbstractTest {
	@InjectMocks
	MahavArrayCheck mahavArrayCheck;

	@Test
	void isMahavArrayCase1() {
		int [] array = {2, 1, 1};
		Assertions.assertEquals(1,mahavArrayCheck.isMahavArray(array));
	}
	@Test
	void isMahavArrayCase2() {
		int [] array =  {2, 1, 1, 4, -1, -1};
		Assertions.assertEquals(1,mahavArrayCheck.isMahavArray(array));
	}
	@Test
	void isMahavArrayCase3() {
		int [] array =  {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
		Assertions.assertEquals(1,mahavArrayCheck.isMahavArray(array));
	}
	@Test
	void isMahavArrayCase4() {
		int [] array =   {18, 9, 10, 6, 6, 6};
		Assertions.assertEquals(0,mahavArrayCheck.isMahavArray(array));
	}
	@Test
	void isMahavArrayCase5() {
		int [] array =   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
		Assertions.assertEquals(1,mahavArrayCheck.isMahavArray(array));
	}
	@Test
	void isMahavArrayCase6() {
		int [] array =   {-6, -3, -3, 8, -5, -4};
		Assertions.assertEquals(0,mahavArrayCheck.isMahavArray(array));
	}
	@Test
	void isMahavArrayCase7() {
		int [] array =  {3, 1, 2, 3, 0};
		Assertions.assertEquals(0,mahavArrayCheck.isMahavArray(array));
	}
}