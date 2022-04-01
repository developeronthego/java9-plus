package jdk.java10.features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionChange {

	public static void main(String[] args) {
		List<Integer> fibonacci = List.of(1, 1, 2, 3, 5, 8, 13);
		List<Integer> copyList = List.copyOf(fibonacci);
		copyList.add(21); // throws exception

		List<Integer> filteredList = fibonacci.stream()
				.filter(i -> i % 2 == 0)
				.collect(Collectors.toUnmodifiableList());
		filteredList.add(21); // throws exception
	}

}
