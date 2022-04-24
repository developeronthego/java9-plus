package jdk.java11.features;

import java.util.Arrays;
import java.util.List;

public class CollectionToArrayChange {

	public static void main(String[] args) {
		List<String> examples = Arrays.asList("Developer", "on", "the", "go");
		examples.toArray(new String[examples.size()]); // old way
		examples.toArray(String[]::new); // JDK 11
	}

}
