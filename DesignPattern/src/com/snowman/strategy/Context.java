package com.snowman.strategy;

/**
 * summary Strategy pattern
 * abstract Strategy and Strategy relationship
 * @author snowman
 * time 2018.07.04
 */
public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double price){
        System.out.println("Price is " + this.strategy.getPrice(price));
    }
}
