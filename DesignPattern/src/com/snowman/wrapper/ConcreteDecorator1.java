package com.snowman.wrapper;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Componet componet) {
        super(componet);
    }

    @Override
    public void doSometing() {
        super.doSometing();
        this.doAnotherThing();
    }

    private void doAnotherThing(){
        System.out.println("function B");
    }
}
