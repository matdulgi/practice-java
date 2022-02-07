package reflectionEx;

public class ClassClass {
    public static void main(String args[]){
        // .getClass() only valid for an instance
        // Class class1 = String.getClass();
        Class class1 = new String().getClass();

        // .class only valid for an Type
        // Class class2 = new String().class;
        Class class2 = String.class;

        /*
        try {
            Class class3 = Class.forName("String");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        */

        try {
            Class class3 = Class.forName("java.lang.String");
            System.out.println("class3 : " + class3.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
