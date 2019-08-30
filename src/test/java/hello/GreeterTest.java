package test.java.hello;

import main.java.hello.Greeter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterHelloWorld(){
        String s = "Hello World";

        Assert.assertEquals(s, greeter.sayHello());
    }
}
