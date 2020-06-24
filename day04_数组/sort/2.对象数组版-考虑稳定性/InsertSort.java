package com.atguigu.array.sort2;

/**
 * 直接插入排序
 * @author shkstart
 * 2018-12-17
 */
public class InsertSort {
	public static void insertSort(DataWrap[] data){
		System.out.println("开始排序");
		int arrayLength = data.length;
		for(int i = 1;i < arrayLength;i++){
			DataWrap temp = data[i];
			if(data[i].compareTo(data[i-1]) < 0){
				int j = i -1;
				for(;j >= 0 && data[j].compareTo(temp) > 0;j--){
					data[j +1] = data[j];
				}
				data[j + 1] = temp;
			}
			System.out.println(java.util.Arrays.toString(data));
		}
		
	}
	public static void main(String[] args) {
		DataWrap[] data = { new DataWrap(9, ""), new DataWrap(-16, ""),
				new DataWrap(21, "*"), new DataWrap(23, ""),
				new DataWrap(-30, ""), new DataWrap(-49, ""),
				new DataWrap(21, ""), new DataWrap(30, "*"),
				new DataWrap(30, "")};
		System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
		insertSort(data);
		System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
	}
}
