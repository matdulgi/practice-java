package genericTest;

public class CallGenericMethod {
    public static void main(String[] args){

        System.out.println(CallGenericMethod.<String>test().getClass().getSimpleName());
    }

    public static <T> T test(){
        Class<? extends T> clazz = (Class<T>) new Object(){}.getClass().getEnclosingMethod().getReturnType();
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return t;

    }
    
}
