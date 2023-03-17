package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,6,7,5,32,1,1,5);
		
		Set<Integer> duplicates = list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		//Set<Integer> duplicates = list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toMap(e, Collections.frequency(list, e)));
		System.out.println(duplicates);
	}

}
