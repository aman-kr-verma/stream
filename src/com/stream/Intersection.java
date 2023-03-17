package com.stream;

import java.util.Arrays;

public class Intersection {
	public static void main(String[] args) {
		
//		Given two integer arrays [9,4,9,8,4] and [4,9,5], return an array of their intersection.
//		Each element in the result must be unique and you may return the result in any order.
//		Expected Output: [9,4] or [4,9]
		
		
		int[] arr1 = {9,4,9,8,4}, arr2 = {4,9,5};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int i=0,j=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]>arr2[j]) j++;
			else if(arr1[i]<arr2[j]) i++;
			else {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}
		}
	}
}
