package com.snowman.factory.simple;

/**
 * simple factory client
 * @author snowman
 * time 2018.07.04
 */
public class Client {

    public static void main(String[] args) {

        Car car1 = CarFactory.createCar("audi");
        Car car2 = CarFactory.createCar("byd");

        car1.run();
        car2.run();
    }

}
