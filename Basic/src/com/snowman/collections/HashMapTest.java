package com.snowman.collections;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("a","b");
        map.put("c","d");
        map.put("e","f");
        map.put("h","g");
        map.put("h","i");
        map.put("j","k");

        for (String value : map.values()){
            System.out.println(value);
        }


        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key);
        }

        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ";" + entry.getValue());
        }

    }

}
