package Fundamentals.kyu8;

import Fundamentals.kyu8.HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("hello world!", HelloWorld.greet());
    }
}