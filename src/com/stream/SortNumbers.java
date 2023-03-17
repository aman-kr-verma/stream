package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class SortNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,3,5,7,8,67,5,3,2,1,3,3,4,56,6,77,7,7,6,6,54,4,4,1);
		
		list.stream().sorted().forEach(System.out::println);
		System.out.println("In reverse order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}
}
 