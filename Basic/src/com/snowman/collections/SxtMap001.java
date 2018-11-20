package com.snowman.collections;

public class SxtMap001 {

    SxtEntry [] arr = new SxtEntry[256];
    int size;

    public void put(Object key,Object value){
        SxtEntry e = new SxtEntry(key,value);
        //解决键重复的问题
        for (int i = 0; i < size; i++) {
            if(arr[i].key.equals(key)){
                arr[i].value = value;
                return;
            }
        }
        arr[size++] = e;
    }

    public Object get(Object key){
        for (int i = 0; i < size; i++) {
            if(arr[i].key.equals(key)){
                return arr[i].value;
            }
        }
        return null;
    }

    public boolean contaionsKey(Object key){
        for (int i = 0; i < size; i++) {
            if(arr[i].key.equals(key)){
                return true;
            }
        }
        return false;
    }

    public boolean contaionsValue(Object value){
        for (int i = 0; i < size; i++) {
            if(arr[i].value.equals(value)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SxtMap001 sxtMap001 = new SxtMap001();
        sxtMap001.put("1","2");
        sxtMap001.put("1","4");

        System.out.println(sxtMap001.get("1"));
    }
}

class SxtEntry{
    Object key;
    Object value;

    public SxtEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}