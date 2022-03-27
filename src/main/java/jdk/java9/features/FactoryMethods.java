package jdk.java9.features;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

	public static void main(String[] args) {
		List<String> factoryList = List.of("one", "two", "three");
		System.out.println(factoryList);
		Set<String> factorySet = Set.of("one", "three", "two");
		System.out.println(factorySet);
		Map<String, String> factoryMap = Map.of("key1", "value1", "key2", "value2");
		System.out.println(factoryMap);
		Map<String, String> factoryEntryMap = Map.ofEntries(Map.entry("key3", "value3"), Map.entry("key4", "value4"));
		System.out.println(factoryEntryMap);
	}

}
