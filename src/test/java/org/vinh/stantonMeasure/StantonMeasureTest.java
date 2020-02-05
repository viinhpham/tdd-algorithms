package org.vinh.stantonMeasure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
class StantonMeasureTest extends AbstractTest {
	@InjectMocks
	StantonMeasure stantonMeasure;

	@Test
	void stantonMesure() {
		int [] array = {1};
		Assertions.assertEquals(1, stantonMeasure.stantonMesure(array));
	}
	@Test
	void stantonMesure1() {
		int [] array = {0};
		Assertions.assertEquals(1, stantonMeasure.stantonMesure(array));
	}
	@Test
	void stantonMesure2() {
		int [] array = { 1, 3, 1, 1, 3, 3, 2, 3,
				3, 3, 4 };
		Assertions.assertEquals(6, stantonMeasure.stantonMesure(array));
	}
	@Test
	void stantonMesure3() {
		int [] array = { 1, 1, 1, 1, 1, 1, 2 };
		Assertions.assertEquals(6, stantonMeasure.stantonMesure(array));
	}
	@Test
	void stantonMesure4() {
		int [] array = {};
		Assertions.assertEquals(0, stantonMeasure.stantonMesure(array));
	}
}