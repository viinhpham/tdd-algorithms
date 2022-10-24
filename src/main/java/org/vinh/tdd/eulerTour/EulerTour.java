package org.vinh.tdd.eulerTour;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * Author : Vinh Pham.
 * Date: 10/20/22.
 * Time : 11:59 PM.
 */
public abstract class EulerTour<T> {
	protected void visitExternal(Node<T> node, T [] result) {}
	protected void preOrder(Node<T> node, T [] result) {}
	protected void inOrder(Node<T> node, T [] result) {}
	protected void postOrder(Node<T> node, T [] result) {}

	public T eulerTour(Node<T> node){
		var result = (T[]) Array.newInstance(node.value().getClass(), 3);
		Arrays.fill(result, 0);

		if (Objects.isNull(node.left()) || Objects.isNull(node.right())) {
			visitExternal(node, result);
		} else {
			preOrder(node, result);
			result[1] = (T) eulerTour(node.left());
			inOrder(node, result);
			result[2] = (T) eulerTour(node.right());
			postOrder(node, result);
		}
		return result[0];
	}
}
