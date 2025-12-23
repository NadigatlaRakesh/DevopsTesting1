package com.practise.dsa.two.pointer;

public class WaterContainer {

	public static void main(String[] args) {
		int a[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(containerWater(a));
	}
	
	public static int containerWater(int a[]) {
		int left = 0;
		int right = a.length-1;
		int maxA = 0;
		while(left < right) {
			int area = Math.min(a[left], a[right]) * (right - left);
			maxA = Math.max(maxA, area);
			if(a[left] < a[right]) {
				left++;
			}else {
				right--;
			}
		}
		return maxA;
	}
}
