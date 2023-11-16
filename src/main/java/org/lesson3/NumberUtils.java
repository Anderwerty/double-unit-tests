package org.lesson3;


public final class NumberUtils {
    private NumberUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
