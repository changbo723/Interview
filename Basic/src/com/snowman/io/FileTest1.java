package com.snowman.io;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

    public static void main(String[] args) {
        File file = new File("./1.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
