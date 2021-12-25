package wrapperTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IntegerTest {
	public static void main(String[] args) {
		// Integer 값으로 int를 초기화할 수 있을까?
		Integer a = new Integer(1);
		System.out.println(a);
		int b = a;
		System.out.println(b);
		System.out.println("Integer 형변환 : " + (int)a);
		// 된다
		// Integer이 int로 형변환 된 것
		

		// Object에 기본 타입을 넣으면?
		System.out.println("Object 형변환 테스트");
		int c = 3;
		Object o = c;
		Class class1 = o.getClass();
		System.out.println(class1.getName());// 타입
		System.out.println(o);
		// Object에 int가 들어가면 자동으로 Integer로 자동박싱된다
		// 즉, 오토박싱은 기본타입이 래퍼객체나 Object에 저장될 경우 실행

		// 리플렉션에서도 오토박싱/언박싱이 될까?
		// 리플렉션은 매개변수로 Object를 받고 반환도 Object로 한다
		// 그럼 이론상으로는 Object가 아닌 기본타입이 들어가거나, 받을 수 있어야한다
		// 1. setter 기본타입 넣어 초기화해보기
		// 2. getter 기본타입에 받아보기
		System.out.println("리플렉션 테스트");
		int d = 4;
		Integer e = new Integer(5);
		int f;
		testWrapper testWrapper = new testWrapper();
		Class clazz = testWrapper.getClass();
//		Method[] methods = clazz.getDeclaredMethods();
		// 오버라이딩을 구분하기 위해 메소드의 이름과 매개변수 타입까지 입력
//		for(Method method:methods) {
		try {
			Method method;
			method = clazz.getDeclaredMethod("setInt", int.class);
			method.invoke(testWrapper, d);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {
			e1.printStackTrace();
		} catch (NoSuchMethodException | SecurityException e1) {
			e1.printStackTrace();
		}
		System.out.println(testWrapper.a);
//		}
		
		
		//Object를 int로 변환가능한가??
		Object o2 = new Object();
		o2 = 3;
		int i = (int)o2;
		System.out.println("object를 int로 변환 : " + i);

		
		//Integer의 SIZE
	}

}

class testWrapper {
	int a;

//	Integer a = new Integer(1);
	void setInt(int i) {
		a = i;
	}
}
