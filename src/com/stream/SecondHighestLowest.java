package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestLowest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,6,4,2,4,67,8,6,432,3);
		
		int sec_highest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(sec_highest);
		
		int sec_lowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("2nd lowest " + sec_lowest);
	}
}
