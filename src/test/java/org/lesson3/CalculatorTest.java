package org.lesson3;

//import org.junit.Ignore;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("before each test");
    }

    @Test
            @Order(10)
//    @Disabled
    void sumShouldReturnSumForPositiveNumbers() {
        System.out.println("skip test");

        int expected = 3;

        int actual = calculator.sum(1, 2);

        assertEquals(expected, actual);
    }

    @Order(20)
    @Test
    void divShouldThrowIllegalArgumentExceptionWhenDivisorIsZero() {
        System.out.println("test with exception");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.div(1, 0));

        assertEquals(exception.getMessage(), "divisor is zero");
    }
}