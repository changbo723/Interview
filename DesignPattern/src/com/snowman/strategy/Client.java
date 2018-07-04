package com.snowman.strategy;

/**
 * summary Strategy pattern
 * Client
 * @author snowman
 * time 2018.07.04
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new BigCustomerStrategy();
        Context context = new Context();
        context.setStrategy(strategy);
        context.printPrice(100d);
    }

}
