package genericTest;

public class CreationGenericClassInstance {

    /** subject : how to get Generic Class Instance with Generic type T
     * T is not Common Class Type, so it's not possible to create with new T()
     *
     *
     */
    public static void main(String[] args) {
        TestClass<Integer> instance1 = new TestClass<>();
        TestClass<Integer> instance2 = new TestClass(new TestType());
        TestClass<Integer> instance3 = new TestClass(TestType.class);

    }

    static class TestClass<T> {
        T t;

        /**
         * case 1
         * try to create instance with field t
         * <p>
         * result : failed
         */
        TestClass() {
//          t = (T) t.getClass().newInstance();
        }

        /**
         * case 2
         * try to create with parameter
         *
         * @param t
         * result : success
         * ### remarks
         *  - it requires Class type argument
         */
        TestClass(T t) {
            try {
                t = (T) t.getClass().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        TestClass(Class<? extends T> t) {
            try {
                this.t = t.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }



    static class TestType{
        int testField;
    }

}

