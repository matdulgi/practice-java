package genericTest;

public class WildCardTest {
	static WildCardTest wildCardTest = new WildCardTest();

	public static void main(String[] args) {
		// 1. 생성자를 통한 제네릭클래스 사용.
		// 제네릭 클래스 내부의 타입 클래스는 생성되어있지 않기 때문에, setter등으로 값을 대입해줘야 한다
		Test<Class0> test = new Test<>();
		test.setVar(new Class0());
		test.getVar().info();

		// 2. 제네릭 메소드 사용
		// 제네릭 메소드 : 제네릭 타입을 선언한 메소드 (어디다가?)
		Test<Class0> test2 = wildCardTest.getTest();
	}

	// 제네릭 클래스를 반환하는 메소드
	// 하고싶은거 : 메소드는 다형성이 적용되어 있어야한다.
	// 매개변수로 들어가는거에 따라서 다른걸 반환해야한다
	// 특정 타입으로 제네렉 클래스를 선언해서
	// 의문 1. 앞에 덩그러니 붙은 제네릭의 역할은?
	<T> Test<T> getTest() {
		// 일단 <?> 타입의 클래스를 받아 왔다.
		// 이 클래스의 제네릭 정보를 사용해서 어떻게 새로운 클래스 제네릭을 결정할까?
		// 반환값에다가 띡 쓴다고 되는게 아니다....?
		// 사용하려면 메소드 앞에다가 제네릭을 선언해 줘야돼
		// 즉, 앞에다가 제네릭을 선언한거 자체가 이 메소드가 제네릭 메소드라는걸 알려주는 것
		Test<T> test = new Test<>();
		return test;
	}
	// ㅇ제네릭메소드
	// 메소드 앞에 붙은 제네릭은 제네릭 클래스와는 상관 없다
	// 
}

//제네릭을 사용한 클래스. 얘를 생성하여 제네릭에다가 하위의 클래스들의 타입을 사용할 것이다
//제네릭 클래스를 선언할 때는, <?>가 아닌 <T>같은 문자가 들어가야한다.
//변수 선언할때  ? var; 이런식으로 선언할 수가 없기 때문

class Test<T> {
	//근데 제네릭 변수는 인스턴스 생성된 적이 없다. jvm이 런타임시 생성하는건가?
	public T var;

	void setVar(T var) {
		this.var = var;
	}

	T getVar() {
		return var;
	}

//	void info() {
//		System.out.println(var.getClass().getSimpleName());
//	}
}

class Class0 {
	void test2() {
	}

	void test() {
		System.out.println("class0");
	}

	void info() {
		System.out.println("Class0");
	}
}

class Class1 extends Class0 {
	void test() {
		System.out.println("class1");
	}
	void info() {
		System.out.println("Class1");
	}
}

class Class2 extends Class0 {
	void test2() {
		System.out.println("class2");
	}
	void info() {
		System.out.println("Class2");
	}

}
