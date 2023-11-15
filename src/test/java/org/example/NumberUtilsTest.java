package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberUtilsTest {

    @Test
    void isOddShouldReturnTrueFor3() {
        assertTrue(NumberUtils.isOdd(3));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 30, 7, 9})
    void isOddParametricMethod(int number) {
        assertTrue(NumberUtils.isOdd(number));
    }
}