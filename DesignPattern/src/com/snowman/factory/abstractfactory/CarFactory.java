package com.snowman.factory.abstractfactory;

/**
 * abstract factory abstract product
 * @author snowman
 * time 2018.07.04
 */
public interface CarFactory {

    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();

}
