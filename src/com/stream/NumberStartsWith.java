package com.stream;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class NumberStartsWith {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,34,22,234,767,2090);
		
		list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).forEach(System.out::println);
		
	}
}
