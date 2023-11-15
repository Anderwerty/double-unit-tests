package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class ATest {
    static int value = 0;
    Calculator calculator = new Calculator();

    @Test
    void test1() {
        ++value;
        System.out.println(value);
    }

    @Test
    void test() {
        ++value;
        System.out.println(value);
    }
}
