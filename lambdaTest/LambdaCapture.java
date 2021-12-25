package lambdaTest;

public class LambdaCapture {

	public LambdaCapture() {
	}
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			
		final int j = i;
		System.out.println(j);
		}
		
	}

}
