package genericTest;

import java.util.ArrayList;
import java.util.List;

public class GetClassWithGeneric{
    public static void main(String[] args) {
        /**
         * # all given information
         *  - Generic Alphabet T
         *
         * # how do i get Instance with given information
         *
         * expected method
         * 1. search fields (getter's return type) -> evaluate if field's type is same to ParameterizedType
         *  -> how to get if the class doesn't has getter which return type of own class?
         * 2.
         *
         *
         */
        // Class clazz = ArrayList<String>.class;
        // the code above throws the error message 'Cannot select from parameterized type'
        Class clazz = ArrayList.class;
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass());



        List<String> list2 = null;
        try {
            list2 = ArrayList.class.newInstance();
            list2.add("1");
            list2.add("2");
            list2.add("3");
        } catch (InstantiationException | IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        System.out.println(list2);
        System.out.println(list2.getClass());
        System.out.println(list2.getClass());
        
    }
}
