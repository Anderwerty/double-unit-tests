package org.lesson5;

public class Example2 {
    public static void main(String[] args) {
        MyLogger myLogger = new MyLogger(LogLevel.DEBUG);
        for (int i = 0; i < 100; i++) {
            myLogger.debug("my message1");
        }
        myLogger.error("my message2");
    }
}

class MyLogger {
    private final LogLevel logLevel;

    MyLogger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }


    public void debug(String message) {
        if (LogLevel.DEBUG == logLevel) {
            System.out.println("[DEBUG]" + message);
        }
    }

    public void error(String message) {
        System.out.println("[ERROR]" + message);
    }
}

enum LogLevel {
    DEBUG,
    ERROR;
}
