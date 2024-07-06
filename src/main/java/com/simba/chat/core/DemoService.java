package com.simba.chat.core;

public interface DemoService {

    void doSomething();

    default void doSomethingElse() {
        System.out.println("I am a demo service");
    }

    static String getName() {
        return "Simba"+shout();
    }

    private static String shout() {
        return "Shouting";
    }
}
