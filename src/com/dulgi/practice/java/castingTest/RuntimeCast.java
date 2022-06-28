package com.dulgi.practice.java.castingTest;

public class RuntimeCast {

	public RuntimeCast() {
	}

	public static void main(String[] args) {
		String a = "123";
		Object o = (Object)a;
		System.out.println(o);
		System.out.println(o.getClass().getSimpleName() + " " + o);
//		int.class.cast(o);
		o = Integer.parseInt(a);

		int c = 0;

		System.out.println(o.getClass().getSimpleName() + " " + o);
		//변환이 안된다 - Object로 형변환했음에도 여전히 클래스는 String으로 인지된다
		//즉, 동적 변환시 instanceOf를 사용한다??
		System.out.println(int.class.equals(o.getClass()));
		System.out.println();


		Object o2;
		String s2 = "456";
		o2 = s2;
		System.out.println(o2.getClass().getSimpleName());

		
		
	}
}
