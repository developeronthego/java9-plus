module jdk.java9.jigsaw.hello {
	exports jdk.java9.jigsaw.hello;
	provides jdk.java9.jigsaw.hello.HelloInterface with jdk.java9.jigsaw.hello.HelloWorld;
}
