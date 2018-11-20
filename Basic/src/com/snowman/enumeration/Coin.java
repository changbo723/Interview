package com.snowman.enumeration;

public enum Coin {

    penny("hello"),quatuer("world");

    private String value;

    Coin(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        Coin coin = Coin.quatuer;
        System.out.println(coin.getValue());
    }
}
