package reflectionEx;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

public class ClassReflection {
    public static void main(String[] args) {
        /**
         * get Class's metadata
         */
        System.out.println("test custom class");
        TestGenericClass<String> testGenericClass = new TestGenericClass<>();
        Class clazz = testGenericClass.getClass();

        System.out.println("test : TypeParameter");
        for (TypeVariable typeVariable : clazz.getTypeParameters()){
            System.out.println(" - "+ typeVariable);
            if (typeVariable instanceof ParameterizedType) System.out.println("saoijfwaeoij");
        }

        System.out.println("test : GenericInterface");
        for (Type type: clazz.getGenericInterfaces()){
            System.out.println(" - "+ type);
            if (type instanceof ParameterizedType) System.out.println("saoijfwaeoij");
        }

        System.out.println("test : GenericSuperclass");
        Type type2 = clazz.getGenericSuperclass();
        System.out.println(" - " + type2);
        if (type2 instanceof ParameterizedType) System.out.println("saoijfwaeoij");

    }

    static class TestGenericClass<T> implements TestInterface {
        T t;
        String msg;

        TestGenericClass(){

        }

        TestGenericClass(String msg){
            this.msg = msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }
    }

    interface TestInterface {


    }
}

