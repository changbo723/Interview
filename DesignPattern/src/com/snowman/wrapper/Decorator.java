package com.snowman.wrapper;

public class Decorator implements Componet{

    private Componet componet;

    public Decorator(Componet componet) {
        this.componet = componet;
    }

    @Override
    public void doSometing() {
        this.componet.doSometing();
    }
}
