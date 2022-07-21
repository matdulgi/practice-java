package reflectionEx;

import java.lang.reflect.Field;

public class FieldEx {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Class clazz = Class.forName("reflectionEx.TestClass");
		TestClass testClass = (TestClass) clazz.newInstance(); //Object 형을 반환하므로 형변환...
		Field[] fields = clazz.getFields();//접근을 못하나..?
		for (Field field: fields) {
			System.out.println(field.getName());
		}
		//private로 선언된 필드에는 접근할 수 없다

//		field.set(testClass, "hello");
//		System.out.println(testClass.getName());
		
		
	}
}
