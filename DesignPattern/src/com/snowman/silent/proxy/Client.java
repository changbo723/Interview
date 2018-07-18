package com.snowman.silent.proxy;

/**
 * summary dynamic proxy
 * client
 * @author snowman
 * time 2018.07.18
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();
    }

}
