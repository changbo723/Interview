package com.snowman.silent.proxy;

/**
 * summary dynamic proxy
 * proxy object
 * @author snowman
 * time 2018.07.18
 */
public class ProxySubject implements Subject{


    //real subject
    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        this.preRequest();
        realSubject.request();
        this.postRequest();
    }

    private void preRequest(){
        System.out.println("brefor do someting");
    }

    private void postRequest(){
        System.out.println("after do someting");
    }
}
