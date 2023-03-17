package com.stream;

import java.util.Arrays;
import java.util.List;

public class LimitSkipNubers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		
		//sum of first 4 nos
		int sum = list.stream().limit(4).reduce((a,b)->a+b).get();
		System.out.println(sum);
		
		//sum of list except first 4 nos.
		int skipsum = list.stream().skip(4).reduce((a,b)->a+b).get();
		System.out.println(skipsum);
	}
}
