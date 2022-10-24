package org.vinh.tdd;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by vinh.phamquoc on 9/2/20
 */
class ContinuousFactorTest extends AbstractTest{
	@InjectMocks
	ContinuousFactor continuousFactor;

	@Test
	public void testCase1(){
		assertEquals(1, continuousFactor.isContinuousFactored(6));

	}
	@Test
	public void testCase2(){
		assertEquals(1, continuousFactor.isContinuousFactored(60));

	}
	@Test
	public void testCase3(){
		assertEquals(1, continuousFactor.isContinuousFactored(90));

	}

	@Test
	public void testCase4(){
		assertEquals(1, continuousFactor.isContinuousFactored(120));

	}
	@Test
	public void testCase5(){
		assertEquals(0, continuousFactor.isContinuousFactored(99));

	}
	@Test
	public void testCase6(){
		assertEquals(0, continuousFactor.isContinuousFactored(121));

	}
	@Test
	public void testCase7(){
		assertEquals(0, continuousFactor.isContinuousFactored(13));

	}

	@Test
	public void testCase8(){
		assertEquals(0, continuousFactor.isContinuousFactored(2));

	}

}