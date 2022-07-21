package staticTest.lifeOfVarInStaticMethod;

public class LifeOfVarInStaticMethod {
    public static void main(String[] args) {

        staticMethod(0);

    }

    public static void staticMethod(int var) {
        System.out.println(var);
        if (var < 5) {
            var++;
            staticMethod(var);
        }
    }
    //case of static method, it's same that there's no way to get finished method
}

class TestClass {
    int var = 0;
}
