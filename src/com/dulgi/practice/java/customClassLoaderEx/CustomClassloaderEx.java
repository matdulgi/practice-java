package com.dulgi.practice.java.customClassLoaderEx;

import com.dulgi.practice.java.callBackTest.BasicCallBackTest;

public class CustomClassloaderEx extends ClassLoader{
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        MyClassLoader myClassLoader = new MyClassLoader();
        System.out.println(myClassLoader);

        System.gc();
        System.out.println("try to load class with custom classloader");
        myClassLoader.loadClass("classloaderEx.unloadClassEx.TestClass");
        TestClass testClass = new TestClass(1);
        System.out.println("classloader of test : " + testClass.getClass().getClassLoader());

        //
        System.out.println("try to load class with custom classloader");
        myClassLoader.loadClass("com.dulgi.practice.java.callBackTest.BasicCallBackTest");
        System.out.println(new BasicCallBackTest().getClass().getClassLoader());

    }
}

class MyClassLoader extends ClassLoader{
    @Override
    public String toString() {
//        return super.toString();
        return "myClassLoader";
    }
}

class TestClass{
    int a;
    TestClass(int a ){
        this.a = a;
    }

}
