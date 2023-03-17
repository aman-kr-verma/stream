package com.stream;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(200);
		
		double avg = list.stream().mapToInt(e->e*e).filter(e->e>100).average().getAsDouble();
		System.out.println(avg);
	}

}
