package stringTest;

public class WrapperTest {
	public static void main(String[] args) {
		//기본타입은 getClass 불가?
		int a = 134;
		int b = 344;
		System.out.println((Integer)a);
		Integer c = new Integer(123);
		System.out.println(c.getClass().getSimpleName());
		System.out.println(c.getClass().getSimpleName().equals("Integer")); 
		Object object = (Object)a;
		
		//기본타입이 Object에 저장되면
		System.out.println(object instanceof Integer);
		
	}

}
