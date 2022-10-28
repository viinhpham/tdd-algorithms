package org.vinh.tdd.eulerTour;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Vinh Pham.
 * Date: 11/9/22.
 * Time : 9:12 PM.
 */
class ArithmeticExpressionEvaluationTest extends AbstractTest {
	@InjectMocks
	ArithmeticExpressionEvaluation arithmeticExpressionEvaluation;

	/**
	 *      +
	 *     / \
	 *    *   -
	 *   / \ / \
	 *  3  2 4  1
	 */
	@Test
	void testCase1(){
		var left = new Node<>(new Node<>(null, null, "3"), new Node<>(null, null, "2"), "*");
		var right = new Node<>(new Node<>(null, null, "4"), new Node<>(null, null, "1"), "-");
		var root = new Node<>(left, right, "+");
		assertEquals(9, Integer.valueOf(arithmeticExpressionEvaluation.eulerTour(root)));
	}

}