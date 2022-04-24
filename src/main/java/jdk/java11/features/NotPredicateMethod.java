package jdk.java11.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateMethod {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Ala", "ma", "kota", " ");
		String withoutBlanks = words.stream()
		  .filter(Predicate.not(String::isBlank))	  
		  .collect(Collectors.joining(","));
		
		System.out.println(withoutBlanks);
	}

}
