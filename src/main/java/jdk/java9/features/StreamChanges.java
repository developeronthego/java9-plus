package jdk.java9.features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamChanges {

	public static void main(String[] args) {
		List<String> takeWhileExample = Stream.iterate("", s -> s + "*")
			.takeWhile(s -> s.length() < 10)
			.collect(Collectors.toList());
		
		takeWhileExample.forEach(System.out::println);
		
        List<Integer> dropWhileExample = Stream.of(1, 3, 5, 6, 8, 9, 10)
            .dropWhile(number -> (number % 2 == 1))
            .collect(Collectors.toList());
  
        System.out.println(dropWhileExample);
		
		Stream.iterate(0, i -> i <= 20, i -> i + 2)
		  .forEach(System.out::println);
		
		List<String> collection = Arrays.asList("1", "2", "3");
        Map<String, String> map = new HashMap<>() {
            {
                put("1", "first");
                put("2", "second");
            }
        };
		
		List<String> collect = collection.stream()
		  .flatMap(s -> Stream.ofNullable(map.get(s)))
		  .collect(Collectors.toList());
		
		collect.forEach(System.out::println);
	}

}
