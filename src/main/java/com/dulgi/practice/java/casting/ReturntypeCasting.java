package com.dulgi.practice.java.casting;

public class ReturntypeCasting {

	public ReturntypeCasting() {
	}

	public static void main(String[] args) {
		TestCastingClass testClass = (TestCastingClass)getObject();
		testClass.test();
	}
	
	public static Object getObject() {
		return new TestCastingClass();
	}

}


class TestCastingClass {
	void test() {
		System.out.println("testClass");
	}
}

