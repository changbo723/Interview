package com.snowman.io;

import java.io.*;

public class StreamTest {

    public static void main(String[] args) {
        OutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("./2.txt");
            Writer writer = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("www.baidu.com");
            bufferedWriter.write("www.google.com");
            bufferedWriter.flush();
            writer.close();

            InputStream inputStream = new FileInputStream("./2.txt");
            Reader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String string = bufferedReader.readLine();
            while(string != null){
                System.out.println(string);
                string = bufferedReader.readLine();
            }
            bufferedReader.close();

            Reader fileReader = new FileReader("./2.txt");
            BufferedReader bufferedReader1 = new BufferedReader(fileReader);
            String string1 = bufferedReader1.readLine();
            while(string1 != null){
                System.out.println(string1);
                string1 = bufferedReader1.readLine();
            }

            String string2 = "ni hao ren shi ni hen gao xing \n fdsafdsa";
            char [] chars = new char[string2.length()];
            string2.getChars(0, string2.length(),chars,0);
            FileWriter fileWriter = new FileWriter("3.txt");
            for (int i = 0; i < chars.length; i++) {
                fileWriter.write(chars[i]);
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
