package com.snowman.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonDemo6 {

    private SingletonDemo6(){}

    private static SingletonDemo6 singletonDemo6 = null;

    public static synchronized SingletonDemo6 getInstance(){
        if(singletonDemo6 == null){
            singletonDemo6 = new SingletonDemo6();
        }
        return singletonDemo6;
    }

    public static void main(String[] args) throws Exception{
        //use reflact to break singleton
        Class<SingletonDemo2> clazz = (Class<SingletonDemo2>) Class.forName("com.snowman.singleton.SingletonDemo2");
        Constructor<SingletonDemo2> constructor = clazz.getDeclaredConstructor(null);

        //default accessible is false
        constructor.setAccessible(true);

        SingletonDemo2 singletonDemo61 = constructor.newInstance();
        SingletonDemo2 singletonDemo62 = constructor.newInstance();

        System.out.println(singletonDemo61 + ";" + singletonDemo62);

        //use Serializable to break singelton
        SingletonDemo2 singletonDemo2 = SingletonDemo2.getInstance();
        System.out.println(singletonDemo2);
        FileOutputStream fos = new FileOutputStream("/Users/snowman/java_interview_all/1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singletonDemo2);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/snowman/java_interview_all/1.txt"));
        SingletonDemo2 singletonDemo21 = (SingletonDemo2) ois.readObject();
        System.out.println(singletonDemo21);


    }

}
