package com.snowman.thread;

/**
 * deep clone and shallow clone
 *
 * 浅复制
 * 被复制的对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来对象
 * 浅复制仅仅复制所考虑的对象，而不知它所用的对象
 */
public class ShallowClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setAge(1);
        student.setName("snowman");

        Student student2 = (Student) student.clone();

        System.out.println(student.getName());
        System.out.println(student2.getName());

        System.out.println("------------------");

        System.out.println(student == student2);
    }
}

class Student implements Cloneable{

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }
}


