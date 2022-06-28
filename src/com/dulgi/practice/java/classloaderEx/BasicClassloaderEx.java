package com.dulgi.practice.java.classloaderEx;

import java.util.Arrays;


public class BasicClassloaderEx {
    public static void main(String[] args) {
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(appClassLoader);
        ClassLoader extClassLoader = appClassLoader.getParent();
        System.out.println(extClassLoader );
        System.out.println(" - methods");
        Arrays.stream(extClassLoader.getClass().getDeclaredMethods()).forEach(s-> System.out.println(s));
        ClassLoader rtClassLoader = extClassLoader.getParent();
        System.out.println(rtClassLoader);
        rtClassLoader.getClass();
        ClassLoader.getSystemResource("");


        // get rt.jar's classloader
    }
}
