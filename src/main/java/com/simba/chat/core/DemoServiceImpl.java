package com.simba.chat.core;

public class DemoServiceImpl implements DemoService{
    @Override
    public void doSomething() {
        System.out.println("do something");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("Shut up");
    }

    public static void main(String[] args) {
        DemoService demoService = new DemoServiceImpl();
        demoService.doSomethingElse();
        demoService.doSomething();
        String name = DemoService.getName();
    }
}
