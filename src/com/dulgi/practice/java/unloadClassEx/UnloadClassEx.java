package com.dulgi.practice.java.unloadClassEx;

public class UnloadClassEx {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader myClassLoader = new MyClassLoader();
        System.out.println(myClassLoader);
        System.out.println("try to load class with custom classloader");
        myClassLoader.loadClass("com.dulgi.practice.java.unloadClassEx.TestClass");
        TestClass testClass = new TestClass(1);
        myClassLoader = null;
        System.out.println(testClass.a);

//        System.out.println(testClass.getClass().getClassLoader());
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
//        classLoader.loadClass("classloaderEx.unloadClassEx.TestClass");
//        System.out.println(testClass.a);
    }
}

class MyClassLoader extends ClassLoader{

}

class TestClass{
    static {
        System.out.println("Test class loaded");
    }

    int a;
    TestClass(){}
    TestClass(int a){
        this.a = a;
    }
}