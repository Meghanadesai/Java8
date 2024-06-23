package com.java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartWithOne {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(18,27,17,38,82,11,23,51);// convert integer to string
		list.stream().map(s -> s + "").filter(s->s.startsWith("1")).forEach(System.out::println);

	}

}
