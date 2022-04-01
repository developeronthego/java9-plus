package jdk.java10.features;

import java.util.List;

public class OptionalChange {

	public static void main(String[] args) {
		List<Integer> oddNumbers = List.of(1, 3, 5, 7, 13);
		Integer firstOddNumber = oddNumbers.stream()
				.filter(i -> i % 2 == 0)
				.findFirst()
				.orElseThrow();
	}

}
