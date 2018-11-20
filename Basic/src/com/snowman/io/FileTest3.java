package com.snowman.io;

import java.io.File;

public class FileTest3 {

    public static void deleteFile(File file){
        if(file.isFile() || file.list().length == 0){
            file.delete();
        }else{
            File [] files = file.listFiles();
            for (File f : files){
                deleteFile(f);
                f.delete();
            }
        }
    }

    public static void main(String[] args) {
        deleteFile(new File(""));
    }

}
