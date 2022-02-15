package reflectionEx;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class ClassReflection {
    public static void main(String[] args) {
        /**
         * get Class's metadata
         */
        System.out.println("test custom class");
        TestGenericClass<String> testGenericClass = new TestGenericClass<>();
        Class clazz = testGenericClass.getClass();

        for (TypeVariable typeVariable : clazz.getTypeParameters()){
            System.out.println("TypeParameter : "+ typeVariable);
        }
        for (Type type: clazz.getGenericInterfaces()){
            System.out.println("GenericInterface : "+ type);
        }
        System.out.println("GenericSuperclass : "+clazz.getGenericSuperclass());
    }
}

class TestGenericClass<T> extends Object implements TestInterface2{
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

interface TestInterface2{


}
