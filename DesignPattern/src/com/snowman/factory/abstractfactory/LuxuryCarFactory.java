package com.snowman.factory.abstractfactory;

/**
 * abstract factory factory
 * @author snowman
 * time 2018.07.04
 */
public class LuxuryCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
