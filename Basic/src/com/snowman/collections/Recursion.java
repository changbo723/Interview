package com.snowman.collections;

public class Recursion {

    public static int getNum(int num){
        if(num == 0 || num == 1){
            return  1;
        }else{
            return num * getNum(num -1);
        }
    }

    public static int getNum2(int num){
        if(num == 1 || num ==2){
            return 1;
        }else{
            return getNum2(num - 1) + getNum2(num -2);
        }
    }

    public static void main(String[] args) {
        System.out.println(getNum(5));
        System.out.println(getNum2(9));
    }

}
