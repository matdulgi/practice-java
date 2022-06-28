package classloaderEx.unloadClassEx;

public class UnloadClassEx {
    public static void main(String[] args) throws ClassNotFoundException {
        TestClass testClass = new TestClass();
        testClass.a = 1;
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        classLoader.loadClass("classloaderEx.unloadClassEx.TestClass");
        System.out.println(testClass.a);
    }
}

class TestClass{

    int a;
}