package reflectionEx;

public class ClassOfWho {

	public static void main(String[] args) {
		//getSimpleName으로 얻어지는건 캐스텅 전일까 후일까
		
		//일단 하위타입으로 캐스팅
		Object obj1 = new Object();
		obj1 = "hello";
		System.out.println(obj1.getClass().getSimpleName());
		//하위타입으로 캐스팅할 시 캐스팅된 클래스 이름이 출력
		
		//상위 타입으로 캐스팅
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		Class1 testClass = (Class1)class2;

		System.out.println(testClass.getClass().getSimpleName());
		//상위로 캐스팅했지만, 하위 클래스인 자식 클래스 이름이 나왔다
		//즉, getClass는 instanceOf와 같이 원래 인스턴스의 클래스를 얻어온다고 생각할 수있따
		
		//자식 객체는 부모 객체의 정보를 모두 포함하고 있다.
		//하지만 그 객체가 부모 클래스 타입으로 캐스팅되었을 때, 자식의 정보는 비활성화? 되고 부모의 정보만을 보여줄? 뿐이다
	}
}


class Class1 {
	void test1() {
		System.out.println("test1");
	}
}

class Class2 extends Class1{
	void test2() {
		System.out.println("test2");
	}
}
