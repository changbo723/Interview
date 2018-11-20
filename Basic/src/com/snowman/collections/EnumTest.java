package com.snowman.collections;

public class EnumTest {

    public static void main(String[] args) {
        for (Color color : Color.values()){
            System.out.println(color);
        }
    }

}

enum Color{
    White,Red,Blue
}

