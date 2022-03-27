package jdk.java9.jigsaw.hello;

public class HelloWorld implements HelloInterface{
    public static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
