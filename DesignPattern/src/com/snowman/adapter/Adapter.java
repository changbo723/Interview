package com.snowman.adapter;


/**
 * summary adapter
 * adapter
 * @author snowman
 * time 2018.07.04
 */
public class Adapter extends Adaptee implements Ps2 {

    @Override
    public void ps2() {
        super.usb();
    }
}
