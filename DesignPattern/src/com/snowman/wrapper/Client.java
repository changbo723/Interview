package com.snowman.wrapper;

public class Client {

    public static void main(String[] args) {

        Componet componet =
                new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()));
        componet.doSometing();

    }

}
