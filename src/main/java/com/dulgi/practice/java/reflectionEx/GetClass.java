package reflectionEx;

public class GetClass {
    public static void main(String args[]){
        // .getClass() only valid for an instance
        // Class class1 = String.getClass();
        Class class1 = new String().getClass();

        // .class only valid for an Type
        // Class class2 = new String().class;
        Class class2 = String.class;

        // runtime reference is required the full path of Class
        /*
        try {
            Class class3 = Class.forName("String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        */
        try {
            Class class3 = Class.forName("java.lang.String");
            System.out.println("class3 : " + class3.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // type of returned Class
        Class clazz1 = String.class;
        System.out.println("clazz1 : " + clazz1.getName());
        Class<String> clazz2 = String.class;
        System.out.println("clazz2 : " + clazz2.getName());
        Class clazz3 = new String().getClass();
        System.out.println("clazz3 : " + clazz3.getName());
        // Class<String> clazz4 = new String().getClass();
        // System.out.println("clazz4 : " + clazz4.getName());
        // note : getClass retuen type of Class(? extends <ownType>)
        // class reserved word return only own Class Type
        
    }
}
