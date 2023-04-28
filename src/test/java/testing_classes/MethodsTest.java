package testing_classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    Methods obj = new Methods();
    @Test
    void add () {
        int a = 4, b = 7, c = 11;
        assertEquals(c, obj.add(a, b));
    }

    @Test
    void printTest() {
        boolean a = false, b = true;
        String res = "Hello world!";

        assertEquals(res, obj.print(a, b));
    }

    @Test
    void fooTest() {
        char s = 'k';
        assertEquals('k', obj.foo(s));
    }

    @Test
    void fNumTest() {
        int a = 5, b = 7;
        assertEquals(7, obj.fNum(a, b));
    }

    @Test
    void fibTest() {
        int n = 5, res = 3;
        assertEquals(res, obj.fib(n));
    }

}