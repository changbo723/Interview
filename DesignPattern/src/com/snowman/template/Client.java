package com.snowman.template;

/**
 * summary template method pattern
 * ConcreteClass
 * @author snowman
 * time 2018.07.04
 */
public class Client {

    public static void main(String[] args) {
        BankTemplateMethod bankTemplateMethod = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("take money");
            }
        };

        bankTemplateMethod.process();

    }

}
