package com.atguigu.array.sort;

/**
 * 折半插入排序
 * 
 * @author shkstart 2018-12-17
 */

public class BinaryInsertSort {
	public static void binaryInsertSort(int[] data) {
		System.out.println("开始排序");
		int arrayLength = data.length;
		for (int i = 1; i < arrayLength; i++) {
			int temp = data[i];
			int low = 0;
			int high = i - 1;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (temp > data[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
			for (int j = i; j > low; j--) {
				data[j] = data[j - 1];
			}
			data[low] = temp;
			System.out.println(java.util.Arrays.toString(data));
		}

	}

	public static void main(String[] args) {
		int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
		System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
		binaryInsertSort(data);
		System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
	}
}
