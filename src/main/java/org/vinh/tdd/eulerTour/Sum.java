package org.vinh.tdd.eulerTour;

import java.util.Arrays;

/**
 * Author : Vinh Pham.
 * Date: 10/21/22.
 * Time : 12:24 AM.
 */
public class Sum extends EulerTour<Integer>{

	@Override
	public void visitExternal(Node<Integer> node, Integer[] result) {
		result[0] = 0;
	}

	@Override
	public void postOrder(Node<Integer> node, Integer[] result) {
		result[0] = result[1] + result[2] + node.value();
	}
	
	@Override
	protected void initArray(Integer[] array){
		Arrays.fill(array, 0);
	}

}
