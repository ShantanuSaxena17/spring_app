package com.billdesk.streamapi;

import java.util.Arrays;
import java.util.List;

import org.w3c.dom.ls.LSOutput;

public class SortingMethodSteamApi {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 9, 6, 1);
		
		numbers.stream()
		.sorted()
		.forEach(System.out::println);
	}
}
