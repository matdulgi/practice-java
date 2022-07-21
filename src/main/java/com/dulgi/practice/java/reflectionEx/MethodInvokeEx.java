package reflectionEx;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvokeEx {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//String을 받는 setter 리플렉션으로 구현
		TestClass testClass = new TestClass(); // 우선 객체 생성..
		Class clazz = testClass.getClass(); // testClass로 Class 생성
		Method setter = null;
		Method getter = null;
		Object result = null;
		setter = clazz.getMethod("setName", String.class); //getMethod 사용
		getter = clazz.getMethod("getName");
		System.out.println(setter.getName());

		//매개변수로는 메서드 축약이름? 문자열, 매개변수의 타입 Class
		//클래스에 .class 붙이면 해당 클래스의 풀네임을 가져온다
		setter.invoke(testClass, "hey");//메서드 객체 실행
		result = getter.invoke(testClass);
		//매개변수로 해당 메서드를 가져올 객체, 입력값
		//Object타입 반환값도 있는데 아직 잘 모르겠다..
		System.out.println(result);
		System.out.println(testClass.getName());
		
		System.out.println(setter.getName().toLowerCase().substring(3));
	}
} 