package com.snowman.factory.factorymethod;

/**
 * simple factory creator
 * @author snowman
 * time 2018.07.04
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
