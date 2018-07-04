package com.snowman.strategy;

/**
 * summary Strategy pattern
 * Strategy
 * @author snowman
 * time 2018.07.04
 */
public class BigCustomerStrategy implements Strategy {

    @Override
    public double getPrice(double price) {
        return 0.8 * price;
    }
}
