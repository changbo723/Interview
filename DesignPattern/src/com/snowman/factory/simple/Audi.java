package com.snowman.factory.simple;

/**
 * simple factory product
 * @author snowman
 * time 2018.07.04
 */
public class Audi implements Car {

    @Override
    public void run() {
        System.out.println("audi is run");
    }
}
