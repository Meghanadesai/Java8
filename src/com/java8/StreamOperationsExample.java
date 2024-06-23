package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperationsExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,78,27,32,65,48,19,40,56,76);
		
		// forEach - prints each element
		numbers.stream().forEach(System.out::println);
		
		// filter - filter even numbers
		List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even numbers : "+ evenNumbers);
		
		// map - squares each number
		List<Integer> squareNumbers = numbers.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println("Square Numbers : "+ squareNumbers);
		
		// distinct - removes duplicates
		List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct numbers : "+ distinctNumbers);
		
		// max - finds the maximum number
		Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
		System.out.println("Maximum number is : "+maxNumber);
		
		// min - finds the minimum number
		Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
		System.out.println("Minimum number is : "+ minNumber);
		
		// limit - limits the number of elements
		List<Integer> limitNumbers = numbers.stream().limit(6).collect(Collectors.toList());
		System.out.println("Limited numbers : "+ limitNumbers);
		
		// reduce - sums all the numbers
		int sum = numbers.stream().reduce(0,Integer::sum);
		System.out.println("Sum is : "+ sum);
		
		// skip - skips the first 4 numbers
		List<Integer> skipNumbers = numbers.stream().skip(4).collect(Collectors.toList());
		System.out.println("Skip numbers are : "+ skipNumbers);
		
		// sorted - sorts the numbers in ascending order
		List<Integer> sortNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted numbers are : "+ sortNumbers);
		
		// collect - collects the elements into a new list
		List<Integer> collectNumbers = numbers.stream().collect(Collectors.toList());
		System.out.println("Colleected numbers are : "+ collectNumbers);
		
		// peek - prints each element before and after mapping
        List<Integer> peekedNumbers = numbers.stream()
                .peek(n -> System.out.println("Before mapping: " + n))
                .map(n -> n * n)
                .peek(n -> System.out.println("After mapping: " + n))
                .collect(Collectors.toList());
        
        // flatMap - flattens nested lists
        List<List<Integer>> nestedLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));
        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened list: " + flattenedList);
	}

}
