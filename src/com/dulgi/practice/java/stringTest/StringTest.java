package stringTest;

public class StringTest {
public static void main(String[] args) {
	System.out.println("\"group\"");
	String a = null;
	String b = "b";
	String c = null + b;
	System.out.println(c.charAt(1));
	System.out.println(a);
	System.out.println(c);
	System.out.println(a.equals("null"));
}
}
