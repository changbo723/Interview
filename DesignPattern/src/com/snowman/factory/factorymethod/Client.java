package com.snowman.factory.factorymethod;

/**
 * simple factory client
 * @author snowman
 * time 2018.07.04
 */
public class Client {

    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();

        c1.run();
        c2.run();
    }
}
