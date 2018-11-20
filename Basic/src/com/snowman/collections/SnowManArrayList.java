package com.snowman.collections;

public class SnowManArrayList {

    //init array
    private Object [] elementData;

    //array size
    private int size;

    public SnowManArrayList() {
    }

    public SnowManArrayList(int initialCapacity){
        if(initialCapacity < 0){
            throw  new IllegalArgumentException("args is error");
        }
        elementData = new Object[initialCapacity];
    }

    //add method
    public void add(Object object){
        //if size great than length, add length
        if(size == elementData.length){
            Object [] newArray = new Object[size * 2 + 1];
            //copy array from old array
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
        this.elementData[size++] = object;
    }

    public int getSize(){
        return size;
    }

    //check array is empty
    public boolean isEmpty(){
        return size == 0;
    }

    //return array element
    public Object get(int index){
        if(index > size){
            throw new IllegalArgumentException("size is error");
        }
        return elementData[index];
    }

    public void remove(int index){
        if(index < 0){
            throw  new IllegalArgumentException("index is error");
        }
        int numMoved = size -index - 1;
        if(numMoved > 0) {
            System.arraycopy(elementData,index + 1,elementData, index,numMoved);
        }
        elementData[--size] = null;
    }

    public void remove(Object object){
        for (int i = 0; i < size; i++) {
            if(get(i).equals(object)){
                remove(i);
            }
        }
    }

    public Object set(int index, Object object){
        if(index < 0){
            throw  new IllegalArgumentException("index is error");
        }
        Object oldValue = elementData[index];
        elementData[index] = object;
        return oldValue;
    }

    public void add(int index, Object object){
        if(index < 0){
            throw  new IllegalArgumentException("index is error");
        }

    }

    public static void main(String[] args) {
        SnowManArrayList snowManArrayList = new SnowManArrayList(3);
        snowManArrayList.add("111");
        snowManArrayList.add("222");
        snowManArrayList.add("333");
        snowManArrayList.add("444");
        snowManArrayList.add("555");

        System.out.println(snowManArrayList.getSize());

        snowManArrayList.get(5);

        snowManArrayList.remove(2);

        snowManArrayList.remove("444");

        System.out.println(snowManArrayList.size);

        for (int i = 0; i < snowManArrayList.size; i++) {
            System.out.println(snowManArrayList.get(i));
        }
    }

}
