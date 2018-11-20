package com.snowman.thread;

import java.util.ArrayList;
import java.util.List;


/**
 * summary producer and consumer
 * clerk
 * @author snowman
 * time 2018.07.20
 */
public class Clerk {

    //MAX COUNT
    public static int MAX = 5;

    //save product container
    public static List<Product> productList = new ArrayList<>();

    //receive product
    public synchronized void receivePoroduct(Product product){
        while(productList.size() >= MAX){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        productList.add(product);
        System.out.println("stock status " + productList.size() + ", new product" + product.getName());
        notifyAll();
    }

    //remove product
    public synchronized void buyProduct(){
        while(productList.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Product product = productList.remove(0);
        System.out.println("stock status " + productList.size() + ", remove product" + product.getName());
        notifyAll();
    }

}
