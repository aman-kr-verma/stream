package com.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		 int sum = list.stream().mapToInt(e->e).sum();
		 System.out.println(sum);
		 
		 int sum1 = list.stream().reduce((a,b)->a+b).get();
		 System.out.println(sum1);
	}
}
