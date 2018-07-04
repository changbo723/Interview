package com.snowman.factory.abstractfactory;

/**
 * abstract factory client
 * @author snowman
 * time 2018.07.04
 */
public class Clinet {

    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
    }

}
