package com.snowman.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 {

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("/Users/snowman/shijiev1.sql");
            byte [] bytes = new byte[256];
            int length = 0;
            while (-1 != (length = inputStream.read(bytes,0,256))){
               String string = new String(bytes,0,length);
                System.out.println(string);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
