package org.vinh.tdd;

/**
 * Author : Vinh Pham.
 * Date: 12/24/22.
 * Time : 9:21 PM.
 */
public class BinarySearch {
	public int search(int[] array, int i, boolean isRecursive) {
		if (isRecursive) {
			return binarySearch(array, i, 0, array.length - 1);
		}
		return binarySearchWithoutRecursive(array, i);
	}

	private int binarySearch(int[] array, int i, int low, int high) {
		int mid = (low + high) >>> 1;
		if (i == array[mid]) {
			return mid;
		} else if (i < array[mid]) {
			return binarySearch(array, i, low, mid - 1);
		} else {
			return binarySearch(array, i, mid + 1, high);
		}
	}

	private int binarySearchWithoutRecursive(int[] array, int i) {
		int low = 0, high = array.length - 1;
		int result = -1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (array[mid] == i) {
				result = mid;
				break;
			} else if (i < array[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return result;
	}
}
