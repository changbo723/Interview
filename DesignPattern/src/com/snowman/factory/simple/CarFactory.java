package com.snowman.factory.simple;

/**
 * simple factory creator
 * @author snowman
 * time 2018.07.04
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
