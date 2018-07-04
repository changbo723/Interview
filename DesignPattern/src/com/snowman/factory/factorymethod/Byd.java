package com.snowman.factory.factorymethod;

/**
 * simple factory product
 * @author snowman
 * time 2018.07.04
 */
public class Byd implements Car {

    @Override
    public void run() {
        System.out.println("byd is run");
    }
}
