package com.snowman.factory.factorymethod;

/**
 * simple factory creator
 * @author snowman
 * time 2018.07.04
 */
public class BydFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Byd();
    }
}
