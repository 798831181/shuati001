package com.sunqc.shuati.zuoshen;

import java.util.Arrays;

/**
 * 选择排序
 * 
 * @author sunqc
 *
 */
public class SelectionSort {
	public static int[] selectionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return arr;
		}
		for (int i = 0; i < arr.length; i++) {
//			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	// for test
	public static int[] generateRandomArray(int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = generateRandomArray(8, 7);
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

}
