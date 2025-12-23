package com.practise.dsa.two.pointer;

import java.util.Arrays;

public class SumOfTwo {

	public static void main(String[] args) {
		int a[] = {0,1,2,3,4,5,6};
		int target = 6;
		int res[] = sumOf2(a, target);
		System.out.println(Arrays.toString(res));
		int[] sumOfAll = sumOfAll(a, target);
		System.out.println(Arrays.toString(sumOfAll));
	}

	private static int[] sumOf2(int[] a, int target) {
		int left =0;
		int right = a.length-1;
		while(left < right) {
			int sum = a[left] + a[right];
			if(sum == target) {
				return new int[] {left,right};
			}else {
				if(sum > target) {
					right--;
				}else {
					left++;
				}
			}
		}
		return null;
	}
	
	private static int[] sumOfAll(int[] a, int target) {
		int left =0;
		int right = a.length-1;
		int count = 0;
		int res[] = new int[a.length-1];
		while(left < right) {
			int sum = a[left] + a[right];
			if(sum == target) {
				res[count] = left;
				count++;
				res[count] = right;
				count++;
				if(sum > target) {
					right--;
				}else {
					left++;
				}
			}else {
				if(sum > target) {
					right--;
				}else {
					left++;
				}
			}
		}
		return res;
	}
}
