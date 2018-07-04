package com.snowman.factory.abstractfactory;

/**
 * abstract factory abstract product
 * @author snowman
 * time 2018.07.04
 */
public interface Seat {
    void message();
}

/**
 * abstract factory product
 * @author snowman
 * time 2018.07.04
 */
class LuxurySeat implements Seat{
    @Override
    public void message() {
        System.out.println("Luxury Seat");
    }
}


class LowSeat implements Seat{
    @Override
    public void message() {
        System.out.println("Luxury Seat");
    }
}
