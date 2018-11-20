package com.snowman.wrapper;

public class ConcreteDecorator2 extends Decorator  {

    public ConcreteDecorator2(Componet componet) {
        super(componet);
    }

    @Override
    public void doSometing() {
        super.doSometing();
        this.doAnotherThing();
    }

    private void doAnotherThing(){
        System.out.println("function C");
    }
}
