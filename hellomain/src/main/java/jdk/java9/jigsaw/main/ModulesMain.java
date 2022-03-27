package jdk.java9.jigsaw.main;

import java.util.ServiceLoader;

import jdk.java9.jigsaw.hello.HelloInterface;
import jdk.java9.jigsaw.hello.HelloWorld;

public class ModulesMain {

    public static void main(String[] args) {
        HelloWorld.sayHelloWorld();
        
        Iterable<HelloInterface> services = ServiceLoader.load(HelloInterface.class);
        HelloInterface service = services.iterator().next();
        service.sayHello();
    }

}
