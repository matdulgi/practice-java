package reflectionEx;

public class ClassGeneric {
    public static void main (String[] args){
        // Class<String> clazz = Integer.getClass();

        TestClass1 testClass = new TestClass1();
        System.out.println(testClass.clazz2.getName());

    
    }
}

class TestClass1{
    // public Class<String> clazz2 = (Class<String>)String.getClass();
    public Class clazz2 = new String().getClass();
    Class class2 = String.class;
}