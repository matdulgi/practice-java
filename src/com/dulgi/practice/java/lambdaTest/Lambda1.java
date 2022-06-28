package lambdaTest;

import java.util.stream.Stream;

public class Lambda1 {

	public Lambda1() { }

	public static void main(String[] args) {
		
	Add z = (int x, int y)->{return x+y;};
	System.out.println(z.add(1, 2));

	String s = "string";
	Stream stream = Stream.generate(()->2).limit(5);
	//stream.forEach(System.out::println);
	stream.forEach(a -> System.out.println(a));
	}
	//즉, 람다는 인터페이스에 함수 하나를 선언 해놓고
	//인스턴스를 생성에서 즉석에서 바로 구현하는거야
	//적혀있는 함수 가져와서 구현하는 과정을 간단히 줄일 수 있는 것
	//당연히 내부 클래스가 생성되는 개념이고,
	//내부에서 변수를 아무리 생성해봤자 지역변수라 외부에 영향을 끼치지 않는다
	//이걸 어떻게 응용할 수 있을까

}
interface Add {
	int add(int a, int b);
	
}
