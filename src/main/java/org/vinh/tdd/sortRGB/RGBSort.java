package org.vinh.tdd.sortRGB;


/**
 * Author : Vinh Pham.
 * Date: 12/22/22.
 * Time : 9:19 PM.
 */
/*
 * Let L be a List of objects colored either red, green, or blue. Design an in-place algorithm sortRBG(L)
 * that places all red objects in list L before the blue colored objects, and all the blue objects before the green objects.
 * Thus the resulting List will have all the red objects followed by the blue objects, followed by the green objects.
 * Hint: use the method swapElements to move the elements around in the List. To receive full credit, you must use positions for traversal,
 * e.g., first, last, after, before, swapElements, etc. which is necessary to make it in-place.
 * */

public class RGBSort {
	//blue, green, red, green

	public void sort(Ball[] balls) {
		int redPointer = 0;
		int greenPointer = balls.length - 1;
		int i = 0;
		while (i <= greenPointer) {
			if (balls[i].color().equals(Ball.RED)) {
				swap(balls, i, redPointer);
				i++;
				redPointer++;
			} else if (balls[i].color().equals(Ball.GREEN)) {
				swap(balls, i, greenPointer);
				greenPointer--;
			} else {
				i++;
			}
		}
	}

	private void swap(Ball[] balls, int left, int right) {
		var temp = balls[left];
		balls[left] = balls[right];
		balls[right] = temp;
	}
}
