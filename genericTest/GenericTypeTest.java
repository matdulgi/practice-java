package genericTest;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class GenericTypeTest {
    public static void main(String[] args) {
        /** test about Generic Type for method
         * contents
         * # cases
         * 1. Generic class
         * 2. method in Generic class
         * 3. Generic Method in common class
         *
         * # want to know
         * ### how to get Generic type
         * ### relation between (case that there are many of Generic e.g. Class,Method or Declare,Parameter or ReturnType,Parameter)
         *
         * ### which is TypeParameters depend on
         *  - class.getTypeParameters returns value of TypeParameters[]
         *  - test on method with no <T> declaration
         * #methoc
         *  - what is GenericParameterType  -> name of class in method's parameter
         *  - what is GenericReturnType  -> as GenericParameterType above, word Generic in method name here maybe means declared things
         *  - what is TypeParameters  -> Generic Types that we know (it returned not Type but TypeVariable)
         * ###
         */

        System.out.println("generic class test");
        TestGenericClass<String> testGenericClass = new TestGenericClass<>(String.class);
        Class clazz1 = testGenericClass.getClass();
        Type[] types = testGenericClass.getClass().getGenericInterfaces();
        for (Type type : types){
            System.out.println(type);
        }
        for (Type type : clazz1.getGenericInterfaces()){
            System.out.println("genericInterface : " + type.getTypeName());
        }
        for (TypeVariable typeVariable : clazz1.getTypeParameters()){
            System.out.println("typeParameters : " + typeVariable);
            System.out.println("typeParameters.getGenericDeclaration: " + typeVariable.getTypeName());
//            System.out.println("typeParameters : " + typeVariable.);
            for (Type type : typeVariable.getBounds()){
                System.out.println("bound : " + type);
                //
            }
            clazz1.getGenericInterfaces();
            clazz1.getGenericSuperclass();
            clazz1.getTypeParameters(); //return typevariable
        }
        System.out.println(clazz1.getTypeParameters());


        System.out.println("\n--------  Generic Method Test ------------");
        System.out.println("# test on Method in Generic Class - has return value, parameters");
        try {
            methodTest( clazz1.getMethod("testMethod", Class.class, String.class) );
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("\n# What exactly is TypeParameters, Which is TypeParameters depend on");
        System.out.println("# option : <T> declaration, Parameters");
        System.out.println("# test for testGetter - has no Generic, parameter,  has return value");
        try {
            methodTest(testGenericClass.getClass().getMethod("testGetter"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("\n# test Generic Method in common class");
        try {
            methodTest(new TestCommonClass().getClass().getMethod("getGenericObject", Class.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void methodTest(Method method){
        System.out.println("### test : GenericParameterTypes");
        for (Type type : method.getGenericParameterTypes()){
            System.out.println(" - " + type);
            //getGenericParameterTypes method return the types of Parameters for declared method
        };
        System.out.println("### test : method.GenericReturnType " );
        System.out.println(" - " + method.getGenericReturnType());
        System.out.println("### test : method.getTypeParameters");
        for (TypeVariable typeVariable : method.getTypeParameters()){
            System.out.println(" - " + typeVariable);
        }

    }
}

class TestGenericClass<T> {
    T t;

//    TestGenericClass(){ }
    TestGenericClass(Class<T > clazz) {
        try {
            t = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    //method on GenericClass
    public T testSetter(Class<T> clazz, String str){
        return t;
    }

    public T testGetter(){
        return t;
    }

    public T testMethod(Class<T> clazz, String str){
        return t;
    }

}

class TestCommonClass{
    public <K, T> T getGenericObject(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }
}