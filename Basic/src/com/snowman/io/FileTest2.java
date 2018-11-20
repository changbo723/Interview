package com.snowman.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest2 {

    public static void main(String[] args) {
        File file = new File("/Users/snowman/java_interview_all/Basic/src/com/snowman/thread");

        String [] names = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".java")){
                    return true;
                }
                return false;
            }
        });

        for(String name : names){
            System.out.println(name);
        }

    }

}
