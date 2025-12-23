package com.practise.dsa.two.pointer;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int a[] = {0,0,1,2,3,3,4,5,5,6,7};
		removeDuplicates(a);
    }
	
	// 2 pointers 
	public static void removeDuplicates(int a[]) {
		int right = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] != a[right]) {
				int temp = a[i];
				a[i] = a[right+1];
				a[right+1] = temp;
				right++;
			}
		}
		right++;
		while(right < a.length) {
			a[right] = 0;
			right++;
		}
		System.out.println(Arrays.toString(a));
	}
}
