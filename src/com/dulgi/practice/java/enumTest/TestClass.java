package enumTest;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {
		EnumTest[] enumTest = EnumTest.values(); 
		EnumTest enum1 = EnumTest.APPLE;
		boolean a = false;
		System.out.println(enum1);
		System.out.println(enum1.name());
		System.out.println(enum1.toString());
		System.out.println(enum1.equals(1));
		System.out.println(enum1.equals("APPLE"));
		System.out.println(enum1.name().equals("APPLE"));
		System.out.println(enum1.toString().equals("APPLE"));
		System.out.println(Arrays.stream(enumTest).anyMatch(v->v.name().equals("APPLW")));

		System.out.println(EnumTest.APPLE);
				
	}
}
