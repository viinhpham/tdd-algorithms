package org.vinh.tdd;

/**
 * Author : Vinh Pham.
 * Date: 12/16/22.
 * Time : 10:27 PM.
 */////pkoo-
public class MergeSort {
	public void sort(int[] array) {
		var temp = new int[array.length];
		mergeSort(array, 0, array.length - 1, temp);
	}

	private void mergeSort(int[] array, int low, int high, int[] temp) {
		if (low < high) {
			int middle = (low + high) >>> 1;
			mergeSort(array,low, middle, temp);
			mergeSort(array, middle + 1, high, temp);
			merge(array, low, middle, high, temp);

		}

	}

	private void merge(int[] array, int low, int middle, int high, int[] temp) {
		int i = low;
		int j = middle + 1;
		int k = low;

		while (i <= middle && j <= high) {
			if (array[i] < array[j]) {
				temp[k] = array[i];
				i++;
			} else {
				temp[k] = array[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			temp[k] = array[i];
			i++;
			k++;
		}
		while (j <= high) {
			temp[k] = array[j];
			j++;
			k++;
		}
		for (int l = low; l <= high; l++) {
			array[l] = temp[l];
		}
	}
}
