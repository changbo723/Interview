package com.snowman.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * summary
 *
 * @author snowman
 * @create 2018.09.05 / 11:38
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> oomObjectList = new ArrayList<>();

        while (true){
            oomObjectList.add(new OOMObject());
        }
    }

}
