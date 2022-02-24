package genericTest;

import java.lang.reflect.*;

public class ReflectionOfGeneric {
    public static void main(String[] args) {
        /** 1. get genericType in own class
         *  2. get genericType in other class
         *  3. get genericType in extending/implementing class  ??
         *
         *  how to get ParameterizedType?
         */

        GenericClass<TestType> genericClass = new GenericClass<>(TestType.class);
        genericClass.showInfo();




        System.out.println(genericClass.getClass().getGenericSuperclass());
        Field field = null;
        Field[] fields;
//                System.out.println(genericClass.getClass().getField("t").get())
            fields = genericClass.getClass().getDeclaredFields();
        try {
            Object clazz = field.getType().newInstance();
//            TestType testType = clazz.newInstance();
//            System.out.println(testType);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }



    /** get genericType in own class
     *
     */
    static class GenericClass<T>{
        public T t;
        public TestType testType;
        public GenericClass<TestType> genericClass;

        public GenericClass() { }

        public GenericClass(Class<? extends T> clazz){
            try {
                t = clazz.newInstance();
                testType = (TestType) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            try {
                test();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }

        public void test() throws NoSuchMethodException, NoSuchFieldException {

            Type type1 = getClass().getField("t").getGenericType();
            Type type2 = getClass().getField("testType").getGenericType();
            System.out.println();

            ParameterizedType type3 = (ParameterizedType)getClass().getField("genericClass").getGenericType();
            System.out.println(type3.getActualTypeArguments().getClass());
            System.out.println();


        }

        public <U> U genericMethod (U u){
            return null;
        }

        public void showInfo(){
//            System.out.println( t.getClass());
            //cannot get GenericField's class directly
        }
    }

    static class TestType{
        String field = "TestType";
        @Override
        public String toString() {
            return field;
        }
    }




}


