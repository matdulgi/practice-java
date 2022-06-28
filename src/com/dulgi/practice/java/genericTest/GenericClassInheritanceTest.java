package genericTest;

public class GenericClassInheritanceTest {

    /** subject : is Generic type assigned in children Class valid in parent Class?
     *
     *
     */
    public static void main(String[] args) {
        Parent<Integer> parent = new Parent<>();
    }

}

class Parent<T>{
    T t;

    Parent(){
        try {
            t = (T) t.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Children<T>{
}

class Children2<T>{
    T t;
}