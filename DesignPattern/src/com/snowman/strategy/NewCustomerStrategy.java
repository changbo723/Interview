package com.snowman.strategy;

/**
 * summary Strategy pattern
 * Strategy
 * @author snowman
 * time 2018.07.04
 */
public class NewCustomerStrategy implements Strategy{

    @Override
    public double getPrice(double price) {
        return price;
    }
}
