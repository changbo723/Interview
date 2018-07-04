package com.snowman.factory.abstractfactory;

/**
 * abstract factory abstract product
 * @author snowman
 * time 2018.07.04
 */
public interface Engine {

    void run();
    void start();

}

/**
 * abstract factory product
 * @author snowman
 * time 2018.07.04
 */
class LuxuryEngine implements Engine{
    @Override
    public void run() {
        System.out.println("run fast");
    }

    @Override
    public void start() {
        System.out.println("start fast");
    }
}

class LowEngine implements Engine{
    @Override
    public void run() {
        System.out.println("run fast");
    }

    @Override
    public void start() {
        System.out.println("start fast");
    }
}
