package com.dulgi.practice.java.classpath;

import java.io.IOException;
import java.io.InputStream;

public class ClassPathTest {

	public ClassPathTest() {
	}
	
	public static void main (String[] args) {
//		System.out.println(System.getProperty("java.class.path"));
		//base class path is classpath root directory
		//root directory is javaPractice

		//case1
		InputStream testIs1 = ClassLoader.getSystemResourceAsStream("classPathTest/testFile");
		try {
			System.out.println("case1 result : " + testIs1.available());
		} catch (IOException e) {
			e.printStackTrace();
		}

		//case2 - with root slash
		InputStream testIs2 = ClassLoader.getSystemResourceAsStream("/classPathTest/testFile");
//		try {
//			System.out.println( "case1 result : " + testIs2.available());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		//case3 - current directory
//		InputStream testIs3 = ClassLoader.getSystemResourceAsStream("testFile");
//		try {
//			System.out.println( "case1 result : " + testIs3.available());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		//failed

		//name of subdirectory's file
//		InputStream testIs4 = ClassLoader.getSystemResourceAsStream("testDir/testFile2");
//		try{
//			System.out.println("case2 result : " + testIs4.available());
//		}catch (IOException e){
//			e.printStackTrace();
//		}
		//failed


//		InputStream testIs5 = ClassLoader.getSystemResourceAsStream("classpathTest/testDir/testFile2");
//		try{
//			System.out.println("case2 result : " + testIs5.available());
//		}catch (IOException e){
//			e.printStackTrace();
//		}

	}
}

