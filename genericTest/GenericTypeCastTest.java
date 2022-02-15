package genericTest;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeCastTest {

	public static void main(String[] args) {

		// <?>와 <Object>의 차이를 잘 모르겠는 등 제네릭에 대한 개념이 부족했따고 판단
		// 제네릭 사용 안할 시 기본 타입은?
		List list1 = new ArrayList();
		list1.add("hello");
//	String elem1 = list1.get(0);
		Object elem1 = list1.get(0);
		System.out.println("list1 타입은? : " + elem1.getClass().getSimpleName());
		System.out.println("list1 값은? : " + elem1);
		// String을 넣었더니 그냥 String으로 지정됐다.

		// 그럼 다른걸 넣으면?
		List list2 = new ArrayList();
		TestClass elem2 = new TestClass();
		list2.add(elem2);
		System.out.println("list2 타입은? : " + list2.get(0).getClass().getSimpleName());
		// 또한 자동으로 저장이 됐다. 그럼 제네릭이 왜 필요한거야?

		// 먄약 서로 다른걸 넣으면?
		List list3 = new ArrayList();
		list3.add("hello");
		list3.add(elem2);
		System.out.println(
				"list2 타입은? : " + list3.get(0).getClass().getSimpleName() + list3.get(1).getClass().getSimpleName());
		// 서로 다른 타입의 객체가 들어가긴 한다

		// 꺼내서 사용할땐 안된다고?
		// String str = list3.get(0);
		// 꺼내서 사용은 안된다
		
		// ㅇ결론
		// 컬렉션은 일반적으로 Object 타입의 객체를 저장한다.
		// 즉 List 는 List<Object>와 같은 말이라는 뜻이다
		// 다른 객체들을 넣어도 Object로 변환된다
		// 만약 제네릭에다가 <?>를 넣으면, Object 대신 다른 클래스로 캐스팅 되겠지
		// 여러 객체가 저장된다는 점을 이용하여 instanceOf 등을 통해 다형성을 적용할 수도 잇겠다
		
		//ㅇ그럼 제네릭은 어디다가 어떻게 사용하는가??
		// ㅁ 하나는 클래스를 처음 설계할 때
		// 보통 보면 클래스 선언시에 작성되어서 클래스 타입 변수 선언시에 들어간다
		//
		// ㅁ 제네릭 클래스를 가져다 쓸 때	
		// 그럼 제네릭을 사용한 클래스 만드는거 말고.... 제네릭이 지정되어 있는 클래스를 사용할 때는?
		// 가져다 쓴다는건 크게 1. 메소드 매개변수로  2. 메소드 선언시 리턴값으로  3. 변수로 선언시  이렇게 3가지로 볼 수 있다
		//	1. 매개변수로 사용할 시
		//  	매개변수이기 때문에 어떤 타입의 제네릭 클래스를 받을 지 지정해야한다
		//		이 때, <?>를 통해서 지정 가능
		//	2. 리턴 값 타입으로 지정
		//		리턴 값에 사용되는 제네릭 클래스는, 메소드 내에서 생성됐거나, 매개변수를 통해 받았을 것이다
		//		매개변수로 받았다면? 보통 그 값을 사용할 거고, 리턴값은 <?>로도 가능할 것??? 같다
		// 		만약 내부에서 생성되었어도 마찬가지...
		// 
		//  3. 변수로 선언시
		//		변수 선언에 사용할 때는 무조건 제네릭 타입을 지정해줘야한다
		// 
		// 
		// 
		
	}

}

class TestClass<T> {
	void test() {
		System.out.println("test입니다");
	}

	@Override
	public String toString() {
		return "testClass []";
	}
}


