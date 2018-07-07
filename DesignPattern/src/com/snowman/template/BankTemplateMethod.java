package com.snowman.template;

/**
 * summary template method pattern
 * AbstractClass
 * @author snowman
 * time 2018.07.04
 */
public abstract class BankTemplateMethod {

    public void takeNumber(){
        System.out.println("take a number");
    }


    public abstract void transact();

    public void evaluate(){
        System.out.println("evaluate");
    }

    public void process(){

        this.takeNumber();

        this.transact();

        this.evaluate();
    }

}