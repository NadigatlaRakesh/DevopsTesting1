package com.practise.dsa.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

public class ReverseString {

	public static void main(String[] args) {
//		checkPalindrome();
		reverseStringWithExactPositions();
		revrsessTRJava8();
		FindLength();
		findCharWiseWords();
		FindLength();
	}

	public static void FindLength() {
		List<String> asList = Arrays.asList("apple", "banana", "art", "cat");
		Map<String, Integer> collect = asList.stream().
				collect(Collectors.toMap(Function.identity(), 
						String::length));
		System.out.println(collect);
	}
	public static void findCharWiseWords() {
		String s = "Apple Banana Ant Bike Car Bus";
		String[] split = s.split(" ");
		Map<Character, ArrayList<String>> map = new HashMap<>();
		for(String str : split) {
			map.computeIfAbsent(str.charAt(0), val -> new ArrayList<String>()).add(str);
		}
		System.out.println(map);
	}
	public static void checkPalindrome() {
		String s = "A man, a plan, a canal: Panama";
		boolean isPalindrome = true;
		char[] charArray = s.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				isPalindrome = false;
			}
			left++;
			right--;
		}
		System.out.println(isPalindrome);
	}

	public static void reverseAString() {
		String s = "Rakesh N";
		char[] charArray = s.toCharArray();
		int j = 0;
		for (int i = charArray.length - 1; i >= charArray.length / 2; i--) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			j++;
		}
		System.out.println(new String(charArray));
	}

	// Reverse a String with original positions
	public static void reverseStringWithExactPositions() {
		String s = "My name is Rakesh";
		String up = "";
		// using split
		String[] split = s.split(" ");
//		for(int i=0;i<split.length;i++) {
//			for(int j=split[i].length()-1;j>=0;j--) {
//				char[] charArray = split[i].toCharArray();
//				up =up + String.valueOf(charArray[j]);
//			}
//			up = up + " ";
//		}
//		System.out.println(up);

		// normal execution
		StringBuilder rsult = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		char[] charArray = s.toCharArray();
		int length = s.length();
		for (int i = 0; i < s.length(); i++) {
			if (charArray[i] == ' ') {
				rsult.append(sb.reverse()).append(' ');
				sb.setLength(0);
			} else {
				sb.append(charArray[i]);
			}
		}
		rsult.append(sb.reverse());
//		System.out.println(rsult.toString());
	}

	// using java8
	public static void revrsessTRJava8() {

		String s = "My Name is Rakesh";
		String collect = Arrays.stream(s.split(" ")).map(word -> 
		new StringBuilder(word).reverse().toString()
				).collect(Collectors.joining(" "));
		System.out.println(collect);
	}
	
	
	
}
