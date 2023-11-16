package org.lesson3;

public class Calculator {

    public Calculator() {
        System.out.println("calculator");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("divisor is zero");
        }
        if (b < 0) {
            throw new IllegalArgumentException("divisor < zero");

        }
        return a / b;
    }
}
