package com.snowman.inner;

public class InnerClassTest {

    public static void main(String[] args) {
        Face face = new Face();
        Face.Nose nose = face.new Nose();
        nose.breath();
    }

}


class Face{

    private String type = "outer";

    class Nose{
        private String type = "inner";
        public void breath(){
            System.out.println(type);
            System.out.println(Face.this.type);
        }

    }

}