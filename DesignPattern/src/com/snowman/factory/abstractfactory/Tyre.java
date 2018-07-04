package com.snowman.factory.abstractfactory;

/**
 * abstract factory abstract product
 * @author snowman
 * time 2018.07.04
 */
public interface Tyre {

    void revlove();

}

/**
 * abstract factory product
 * @author snowman
 * time 2018.07.04
 */
class LuxuryTyre implements Tyre{
    @Override
    public void revlove() {
        System.out.println("Luxury Tyre");
    }
}

class LowTyre implements Tyre{
    @Override
    public void revlove() {
        System.out.println("Low Tyre");
    }
}
