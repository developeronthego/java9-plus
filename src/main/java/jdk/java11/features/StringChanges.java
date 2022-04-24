package jdk.java11.features;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringChanges {

	public static void main(String[] args) {
		String text = "I am \n developeronthego.pl \n \nreader.";
		List<String> lines = text.lines()
				.filter(Predicate.not(String::isBlank))
				.map(String::strip)
				.collect(Collectors.toList());
		System.out.println(lines);
		
		String title = " developeronthego.pl ";
		System.out.println(title.repeat(2));
		System.out.println(title.stripLeading());
		System.out.println(title.stripTrailing());
	}

}
