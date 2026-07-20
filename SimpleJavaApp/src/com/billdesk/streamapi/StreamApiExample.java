package com.billdesk.streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		Stream<Integer>numbersStream = numbers.stream(); 
		numbersStream.forEach((Integer i)->{
			System.out.println(i);
		});
	}
}
