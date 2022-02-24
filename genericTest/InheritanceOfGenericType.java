package genericTest;

public class InheritanceOfGenericType {
    public static void main(String[] args) {

    }

    class TestClass{
       GenericClass1<TypeClass> genericClass;
    }

    class GenericClass1<T>{
       T t;

       public void showInfo(){
           System.out.println("type is " + t.getClass());
       }
    }

    class GenericClass2<T>{
        T t;
    }

    /**
     * no TypeVariable
     */
//    class TestClass{
//
//    }

    /**
     * different TypeVariable
     * @param <E>
     */
    class ChilerenClass2<E>{

    }

    class TypeClass{

    }
}
