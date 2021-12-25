package stringTest;

public class StirngMinusInt {

	public StirngMinusInt() {
	}

	public static void main(String[] args) {
		String a = "hello";
		int b = 1;
		a = a + b;
		System.out.println(a);
//		a = a - b; 뺄셈은 안된다
		System.out.println(a.replace(b+"", ""));
		System.out.println(a.replace(a.charAt(a.length()-1)+"", ""));
		//뺄셈하기 참힘드네~~
	}
}
