package inheritanceTest;

public class InheritanceTest{

	public static void main(String[] args) {
		
		Abstract abstract1 = new Child(); 
		Parent parent = new Child();
		Child child = new Child();

		abstract1.test();
		parent.test();
		child.test();

	}
}

abstract class Abstract{
	public void test() {
		System.out.println("abstract");
	};

}


class Parent extends Abstract{
	@Override
	public void test() {
		System.out.println("parent");
	}
}


class Child extends Parent{
	@Override
	public void test() {
		System.out.println("child");
	}

}
