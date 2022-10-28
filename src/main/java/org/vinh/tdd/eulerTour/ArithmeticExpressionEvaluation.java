package org.vinh.tdd.eulerTour;

import java.util.Arrays;

/**
 * Author : Vinh Pham.
 * Date: 11/7/22.
 * Time : 11:17 PM.
 */
public class ArithmeticExpressionEvaluation extends EulerTour<String>{
	@Override
	protected void visitExternal(Node<String> node, String[] result) {
		result[0] = node.value();
	}

	@Override
	protected void postOrder(Node<String> node, String[] result) {
		result[0] = evaluate(node.value(), result[1], result[2]);
	}

	@Override
	protected void initArray(String[] array) {
		Arrays.fill(array, "");
	}
	private String evaluate(String expression, String a, String b){
		return switch (expression) {
			case "+" -> Integer.valueOf(a) + Integer.valueOf(b) + "";
			case "-" -> Integer.valueOf(a) - Integer.valueOf(b) + "";
			case "*" -> Integer.valueOf(a) * Integer.valueOf(b) + "";
			case "/" -> Integer.valueOf(a) / Integer.valueOf(b) + "";
			default -> throw new IllegalStateException("Unexpected value: " + expression);
		};
	}
}
