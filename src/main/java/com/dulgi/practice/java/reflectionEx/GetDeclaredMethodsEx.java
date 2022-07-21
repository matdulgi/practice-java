package reflectionEx;

import java.lang.reflect.Method;

public class GetDeclaredMethodsEx {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class clazz = Class.forName("reflectionEx.TestClass");
		TestClass testClass = (TestClass) clazz.newInstance();
		TestInterface testInterface = new TestClass();
		Class class2 = testInterface.getClass();
		Method[] methods = clazz.getMethods();
		Method[] declaredMethods = clazz.getDeclaredMethods();
		Method[] declaredMethods_poly = class2.getDeclaredMethods();
		
		//Class의 getMethods는 해당 메서드의 메서드와 상속된 메서드를 모두 가져온다
		System.out.println("-getMethods 사용-");
		for(Method method:methods) {
			System.out.println(method.getName());
		}

		//getDeclaredMethods는 해당 클래스엑서 선언된 메서드만을 모두 가져온다
		System.out.println("\ngetDeclaredMethods 사용");
		for(Method method:declaredMethods) {
			System.out.println(method.getName());
		}

		//다형성 적용시 모든 메소드를 다 가져온다
		System.out.println("\ngetDeclaredMethods 사용");
		for(Method method:declaredMethods_poly) {
			System.out.println(method.getName());
		}
	}
	
}
