package pl.coderslab.tdd.creation;

import org.junit.Test;
import pl.coderslab.tdd.creation.tdd.creation.HelloWorld;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void helloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.helloWorld());
    }

    @Test
    public void helloMoon_should_return_HelloMoon(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello Moon", helloWorld.helloMoon());
    }
}
