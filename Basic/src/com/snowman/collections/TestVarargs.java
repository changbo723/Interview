package com.snowman.collections;

public class TestVarargs {

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
    }

    private static int sum(int ... nums){
        int sum = 0;

        for (int i : nums){
            sum += i;
        }

        return sum;
    }

}
