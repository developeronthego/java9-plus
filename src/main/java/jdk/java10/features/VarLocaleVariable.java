package jdk.java10.features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class VarLocaleVariable {
	// TODO: you can use var only as local type
//	var classVariable; // compile time error

	public static void main(String[] args) throws FileNotFoundException {
		var value = 10;
		var text = "hello!";
		var list = List.of("ala", "ma", "kota", value, text);
		for (var element : list) {
			System.out.println(element);
		}

		for (var i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		try (var bufferedReader = new BufferedReader(new FileReader("myapp-log.txt"))) {
			/* some business logic */
		} catch (IOException e) {
			/* some logger */
		}

//		TODO: examples that won't work
//		var foo; // error, var is effectively final
//		foo = "Foo";
		
//		var users = new ArrayList<String>(); // var doesn't match interface (here it will be List<>)
//		users = new LinkedList<>();
		
//		var nullVar = null; // can't assigned null to var

//		var oneCharacter = 0; 
//		oneCharacter = "c"; // wrong type
	}

//	TODO: var can't be used as method parameter type or return type
//	public int test(var param) {
//		return 1;
//	}
//	
//	public var test(int param) {
//		return 1;
//	}

}
