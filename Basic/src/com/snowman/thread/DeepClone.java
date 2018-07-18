package com.snowman.thread;

/**
 * 深复制
 * 被复制对象的所有变量都含有与原来的对象相同的值，出去那些引用其他对象的变量。那些引用其他
 * 对象的变量将指向被复制过的新对象，而不在是原有的那些被引用的对象。深复制需要把复制的对象
 * 所引用的对象都复制一遍
 * 为什么我们在派生类中覆盖Object的clone方法时，一定要调用super.clone
 * 在运行时刻，Object中的clone识别出你要复制的是哪一个对象，然后为此对象分配空间
 * 并进行对象的复制，将原始对象的内容一一复制到新对象的存储空间中
 */
public class DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        teacher.setAge(40);
        teacher.setName("snowman");

        Student2 student2 = new Student2();
        student2.setAge(2);
        student2.setName("crazy");
        student2.setTeacher(teacher);

        Student2 student3 = (Student2) student2.clone();

        System.out.println(student3.getAge());
        System.out.println(student3.getName());

        teacher.setName("chris");

        System.out.println(student3.getTeacher().getName());
        System.out.println(student3.getTeacher().getAge());

    }

}


class Teacher implements Cloneable{

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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student2 implements Cloneable{

    private Teacher teacher;
    private int age;
    private String name;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

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
        Student2 student2 = (Student2) super.clone();
        student2.setTeacher((Teacher) student2.getTeacher().clone());
        return student2;
    }
}