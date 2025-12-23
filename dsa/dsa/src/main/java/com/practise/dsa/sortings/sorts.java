package com.practise.dsa.sortings;

import java.util.Arrays;

public class sorts {

	public static void main(String[] args) {
		int array[] = {9,8,1,4,0,2,6,11,10,5,7};
		selectionSort(array);
	}

	// First we need to select 1 and loop with other and need to take least 
	// value and place that in first place and vice versa Need to do loop for All.
	// 
	private static void selectionSort(int array[]) {
		for(int i=0;i<array.length;i++) {
			int minVal = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j] < array[minVal]) {
					minVal = j;
				}
			}
			int temp = array[i];
			array[i] = array[minVal];
			array[minVal] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
