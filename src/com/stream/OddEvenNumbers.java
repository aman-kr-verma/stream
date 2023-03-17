package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> evens = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		List<Integer> odds = list.stream().filter(e->e%2==1).collect(Collectors.toList());
		System.out.println("evens \n" + evens);
		System.out.println("odds \n" +odds);
	}
}
