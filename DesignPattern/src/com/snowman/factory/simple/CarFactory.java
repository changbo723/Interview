package com.snowman.factory.simple;

/**
 * simple factory creator
 */
public class CarFactory {

    public static Car createCar(String type){
        if("audi".equals(type)){
            return new Audi();
        }else if("byd".equals(type)){
            return new Byd();
        }else{
            return null;
        }
    }

}
