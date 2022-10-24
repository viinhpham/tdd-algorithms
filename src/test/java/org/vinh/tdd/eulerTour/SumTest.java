package org.vinh.tdd.eulerTour;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.vinh.tdd.AbstractTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Vinh Pham.
 * Date: 10/24/22.
 * Time : 6:46 AM.
 */
class SumTest extends AbstractTest {
	@InjectMocks
	private Sum sum;

	@Test
	/*
	*    3
	*   / \
	*  1   0
	* / \
	* 0  0
	*
	* */
	void eulerTour() {
		var leftChild = new Node<>(null, null, 0);
		var rightChild = new Node<>(null, null, 0);
		var left = new Node<>(leftChild, rightChild, 1);

		var right = new Node<>(null, null, 0);
		var node = new Node<>(left, right, 3);
		assertEquals(4, sum.eulerTour(node));
	}

	@Test
		/*
		 *     3
		 *   /   \
		 *  1      2
		 * / \    / \
		 * 0  0  0   0
		 *
		 * */
	void eulerTour2() {
		var leftChild = new Node<>(null, null, 0);
		var rightChild = new Node<>(null, null, 0);
		var left = new Node<>(leftChild, rightChild, 1);

		var leftChild1 = new Node<>(null, null, 0);
		var rightChild1 = new Node<>(null, null, 0);
		var right = new Node<>(leftChild1, rightChild1, 2);

		var node = new Node<>(left, right, 3);
		assertEquals(6, sum.eulerTour(node));
	}


}