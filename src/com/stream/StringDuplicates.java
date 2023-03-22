package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicates {
	public static void main(String[] args) {
		String in = "stringduplicates";
		
		//Map<String, Integer> duplicates = in.chars().collect(Collectors.groupingBy(s->s));
		
		//Map<String, List<String>> duplicates = Arrays.stream(in.split("")).collect(Collectors.groupingBy(s -> s));
		
		 Map<String, Long> dups = Arrays.stream(in.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(dups);
		
		
	}
}
