package com.snowman.collections;

public enum EnumTest3 {

    test1("1"),test2("2");

    EnumTest3(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        EnumTest3 enumTest3 = EnumTest3.test1;
        System.out.println(enumTest3.getValue());
    }
}
