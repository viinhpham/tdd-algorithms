package org.vinh.guthrie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 2/5/20
 */
class GuthrieIndexTest extends AbstractTest {
	@InjectMocks
	GuthrieIndex guthrieIndex;

	@Test
	void guthrieIndex() {
		Assertions.assertEquals(0, guthrieIndex.guthrieIndex(1));
	}
	@Test
	void guthrieIndex1() {
		Assertions.assertEquals(1, guthrieIndex.guthrieIndex(2));
	}
	@Test
	void guthrieIndex2() {
		Assertions.assertEquals(7, guthrieIndex.guthrieIndex(3));
	}
	@Test
	void guthrieIndex3() {
		Assertions.assertEquals(2, guthrieIndex.guthrieIndex(4));
	}
	@Test
	void guthrieIndex4() {
		Assertions.assertEquals(8, guthrieIndex.guthrieIndex(42));
	}
}