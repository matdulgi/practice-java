package enumTest;

import java.io.ObjectInputStream.GetField;

public enum EnumTest {
	APPLE(1), BANANA(2), ORANGE(3);
	//얘들은 전부 EnumTest 타입의 값들이다
	//각각의 변수로 EnumTest 타입의 객체가 생성된다 
	//즉, EnumTest APPLE = new EnumTest();
	//EnumTest BANANA = new EnumTest();
	//EnumTest ORANGE = new EnumTest();와 같다
	//따라서 생성자랑 메서드도 사용 가능? 그건 나중에 알아보자
	private final int num;

	private EnumTest(int num) { 
		this.num = num;
	}

	
	public int getValue(){
		return num;
	}
	
}
