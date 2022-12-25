package org.vinh.tdd;

import java.util.Random;

/**
 * Author : Vinh Pham.
 * Date: 12/19/22.
 * Time : 9:08 PM.
 */
public class QuickSort {
	public void sort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivotIndex = partition(array, left, right);
			quickSort(array, left, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, right);
		}
	}

	private int partition(int[] array, int left, int right) {
		var random = new Random();
		int pivotIndex = random.nextInt(right - left + 1) + left;
		int pivot = array[pivotIndex];
		int j = left;
		int k = right;
		while (j <= k) {
			while (array[j] < pivot) {
				j++;
			}
			while (array[k] > pivot) {
				k--;
			}
			if (j <= k) {
				swap(array, j, k);
				j++;
				k--;
			}
		}
		return k;
	}

	private void swap(int[] array, int j, int k) {
		int temp = array[j];
		array[j] = array[k];
		array[k] = temp;
	}

}
