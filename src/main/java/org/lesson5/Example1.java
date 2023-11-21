package org.lesson5;

public class Example1 {
    public static void main(String[] args) {
        execute();
        skipDebug();
        //...

        debug();
    }


    private static void execute() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
//            System.out.println(i);
        }

    }


    private static  void skipDebug(){
        for (int i = 0; i < 5; i++) {
            doSomething();
        }

    }


    private static void debug(){
        for (int i = 0; i <5 ; i++) {
            doSomething();
        }
    }

    private static void doSomething() {
        System.out.println("Do something");
    }
}
