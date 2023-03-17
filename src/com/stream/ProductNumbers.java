package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductNumbers {
	public static void main(String[] args) {
		Integer[] array = {11,2,3,3};
		//List<Integer> list = Arrays.asList(1,2,9,346,63456,67,56,467,45);
		List<Integer> list = Arrays.asList(array);
		Optional<Integer> product = list.stream().reduce((a,b)->a*b);
		if(product.isPresent()) {
		System.out.println("product : " + product.get());
		}
		else {
			System.out.println("An error occured.");
		}
	}
}
