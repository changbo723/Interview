package com.snowman.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {

    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("./2.txt",true);
            String string = "welcome";
            byte [] bytes = string.getBytes();
            outputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
