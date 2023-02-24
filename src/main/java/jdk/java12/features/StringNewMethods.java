package jdk.java12.features;

public class StringNewMethods {
    public static void main(String[] args) {
        String text = "Java 12 features";
        String shiftText = text.indent(10);
        System.out.println(shiftText);

        System.out.println(new StringBuilder(text).reverse()); //before jdk 12
        String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
        System.out.println(transformed);
    }
}
