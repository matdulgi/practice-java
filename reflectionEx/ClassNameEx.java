package reflectionEx;

public class ClassNameEx {
	public static void main(String[] args) {
		Class clazz = null;
		try {
			clazz = Class.forName("reflectionEx.TestClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Object asdf = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println("ClassName : " + clazz.getName());
		System.out.println("simpleName : " + clazz.getSimpleName());

	}
}
