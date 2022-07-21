package reflectionEx;

//리플렉션 메소드를 구현할 대상 클래스
public class TestClass implements TestInterface{
	private String name = null;
	private String value = null;
	private int number = 0;
	private String string = "";
	public String testField = "hello";
	
	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void voidMethod() {
	}

	@Override
	public String stringMethod() {
		return null;
	}
	
}
