package org.vinh.tdd.centerFifteen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
class ArrayCenteredFifteenTest extends AbstractTest {
	@InjectMocks
	ArrayCenteredFifteen arrayCenteredFifteen;

	@Test
	void isCentered15() {
		int [] array = {3, 2, 10, 4, 1, 6, 9};
		Assertions.assertTrue(arrayCenteredFifteen.isCentered15(array));
	}
	@Test
	void isCentered15_1() {
		int [] array = {2, 10, 4, 1, 6, 9};
		Assertions.assertFalse(arrayCenteredFifteen.isCentered15(array));
	}
	@Test
	void isCentered15_2() {
		int [] array = {3, 2, 10, 4, 1, 6};
		Assertions.assertFalse(arrayCenteredFifteen.isCentered15(array));
	}
	@Test
	void isCentered15_3() {
		int [] array =  {9, 15, 6};
		Assertions.assertTrue(arrayCenteredFifteen.isCentered15(array));
	}
	@Test
	void isCentered15_4() {
		int [] array =  {1, 1, 2, 2, 1, 1};
		Assertions.assertFalse(arrayCenteredFifteen.isCentered15(array));
	}
	@Test
	void isCentered15_5() {
		int [] array =  {1, 1, 15, -1, -1};
		Assertions.assertTrue(arrayCenteredFifteen.isCentered15(array));
	}
	@Test
	void isCentered15_6() {
		int [] array =  {1, 1, 8, 3, 1, 1};
		Assertions.assertTrue( arrayCenteredFifteen.isCentered15(array));
	}
}