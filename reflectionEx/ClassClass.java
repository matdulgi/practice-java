package reflectionEx;

public class ClassClass {
    public static void main(){
        // .getClass() only valid for an instance
        // Class class1 = String.getClass();
        Class class1 = new String().getClass();

        // .class only valid for an Type
        // Class class2 = new String().class;
        Class class2 = String.class;

        
    }
    
}
