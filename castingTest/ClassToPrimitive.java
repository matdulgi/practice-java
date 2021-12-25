package castingTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassToPrimitive {

	public ClassToPrimitive() {
	}

	public static void main(String[] args) {
		int a = 0;
		Integer b = new Integer(123);
//		a = b;
//		System.out.println(a);

		int i2 = 456;
		Integer c;
		c = i2;
		System.out.println(c);
		
		//int와 래퍼클래스는 자유롭게 형변환이 된다. 그럼 리플렉션에서는?
		
		Class<TestClass> class1 = TestClass.class;
		try {
			TestClass testClass = new TestClass();
			Method method1= class1.getMethod("setIntWithInteger", int.class , Integer.class);
			method1.invoke(testClass, a, b);
			Method method2= class1.getMethod("setIntWithInteger", Integer.class);
			method2.invoke(testClass, b);
			Method method3 = class1.getMethod("setIntegerWithInt", int.class);
			method3.invoke(testClass, i2);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	//public 써주지 않을 시 리플렉션이 적용 안된다. 왜???
	//같은 패키지 안에 있는데??
	//일단 원리부터 생각해보자
	//
	//ㅇ리플렉션을 실행할 시, 
	//1. 해당 클래스에 바로 접근하는게 아닌 해당 클래스에 대한 정보를 가져온다 
	//2. class를 통해 얻어올 시 해당 클래스에 대한 정보를 jvm의 클래스 쪽에서 확인하겠ㅈ디??
	//3. 이때, 접근제한이 걸려있는 요소에 대해서는 접근할 수 없다??
	
}
class TestClass{
	//리플렉션에 사용할 함수
	public void setIntWithInteger(int i, Integer p) {
		i = p;
		System.out.println(i);
	}
	public void setIntWithInteger(Integer p) {
		int i = p;
		System.out.println(i);
	}
	public void setIntegerWithInt(int i) {
		Integer p = i;
		System.out.println(p);
	}
}
