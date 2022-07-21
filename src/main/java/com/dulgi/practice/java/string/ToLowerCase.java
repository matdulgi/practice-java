package stringTest;

public class ToLowerCase {
	public static void main(String[] args) {
		String testStr = "HelloWorld";
		char[] testStrArr = testStr.toCharArray();
		testStrArr[0] = (char) (testStrArr[0]+32);
		
		System.out.println(new String(testStrArr));
		System.out.println("toUpperCase : " + testStr.toUpperCase());
	}
}
