package com.snowman.collections;

import java.util.Objects;

public class SxtMap002 {

//    SxtEntry [] arr = new SxtEntry[256];
    int size;


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        SxtMap002 sxtMap002 = (SxtMap002) object;
        return size == sxtMap002.size;
    }

    @Override
    public int hashCode() {

        return Objects.hash(size);
    }

    public static void main(String[] args) {

    }

}
