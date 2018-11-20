package com.snowman.javassist;

import javassist.*;

import java.io.IOException;

/**
 * summary
 *
 * @author snowman
 * @create 2018.09.06 / 16:43
 */
public class SsistTest {

    public static void main(String[] args) throws CannotCompileException, IOException, NotFoundException {
        ClassPool classPool = ClassPool.getDefault();

        CtClass ctc = classPool.makeClass("com.snowman.javassist.Emp");

        CtField cf1 = CtField.make("private String name;",ctc);
        CtField cf2 = CtField.make("private int age;",ctc);
        ctc.addField(cf1);
        ctc.addField(cf2);

        CtMethod ctMethod1 = CtMethod.make("public String getName(){return name;}",ctc);
        CtMethod ctMethod2 = CtMethod.make("public int getAge(){return age;}",ctc);

        ctc.addMethod(ctMethod1);
        ctc.addMethod(ctMethod2);

        CtConstructor ctConstructor = new CtConstructor(new CtClass[]{classPool.get("java.lang.String"),CtClass.intType},ctc);
        ctConstructor.setBody("{this.name=name;this.age=age;}");
        ctc.writeFile("/Users/snowman/Emp.class");
        System.out.println("finish ------------");

    }

}
