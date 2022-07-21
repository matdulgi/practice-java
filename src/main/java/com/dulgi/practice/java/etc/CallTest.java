package etcTest;

public class CallTest {

	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = a;
	}
	static void set(int a) {
		a = 24;
	}
	public static void main(String[] args) {
		int start = 94, end = 5;
		
		swap(start, end);
		System.out.println(start +", " + end );
		set(start);
		System.out.println(start);
	}
}

