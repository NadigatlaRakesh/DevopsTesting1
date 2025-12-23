package com.practise.dsa.arrays;

import java.util.Arrays;

public class ArraysCls {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println(Arrays.toString(reverseArray(array)));
//		System.out.println(Arrays.toString(reverseArray2(array)));
//		SmallANDLarge(array);
		int arr[] = {11,12,15,17,16,20,19,18,11,15,18};
//		removeDuplicatFromSortedArray(arr);
		int array2[] = {0,1,0,2,0,0,3,4,5,0,6};
//		MoveZerosToEnd(array2);
		MoveZerosToEndUsingSwap(array2);
		
	}
	
	public static int[] reverseArray(int array[]) {
		int count = 0;
		int length = array.length;
		for(int i = length-1;i >= array.length/2;i--) {
			int temp = array[i];
			array[i] = array[count];
			array[count] = temp;
			count++;
		}
		return array;
	}
	
	public static int[] reverseArray2(int array[]) {
		int newArray[] = new int[array.length];
		int countArr = 0;
		for(int i=array.length-1;i>=0;i--) {
			newArray[countArr] = array[i];
		}
		return array;
	}
	
	// Remove duplicates from sorted array
	public static void removeDuplicatFromSortedArray(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		int j = 0;
		for(int x = 0;x<arr.length;x++) {
			if(arr[x] != arr[j]) {
				j++;
				arr[j] = arr[x];
			}
		}
		j++;
		for(int i=0;i<j;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void SmallANDLarge(int array[]){
		int minValue = array[0], maxValue = array[0];
		for(int i=0;i<=array.length-1;i++) {
			if(array[i] < minValue) {
				minValue = array[i];
			}else if(array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		System.out.println("minValue: "+minValue + " maxValue: "+ maxValue);
	}
	
	// MoveZerosToEnd using Two pointer
	public static void MoveZerosToEnd(int array[]) {
		int j = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i] != 0) {
				array[j] = array[i];
				j++;
			}
		}
		while(j < array.length) {
			array[j] = 0;
			j++;
		}
		System.out.println(Arrays.toString(array));
	}
	
	// MoveZerosToEnd using swapping
	public static void MoveZerosToEndUsingSwap(int array[]) {
		int j=0;
		for(int i=0;i<array.length;i++) {
			if(array[i] != 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
}
