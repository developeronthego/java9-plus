package jdk.java11.features;

import java.util.function.Predicate;

public class LocalVarLambdaChange {

	public static void main(String[] args) {
		Predicate<String> predicate = a -> true; // old
		Predicate<String> varPredicate = (var a) -> true; // new
	}

}
