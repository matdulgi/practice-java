package genericTest;

public class GenericClassWithNoFiled {
    /**
     *
     */
    public static void main(String[] args) {

    }

    class TestClass<T>{
        public <T> T getObj(T arg){
            T t = arg;
            return t;
        }

    }

}

