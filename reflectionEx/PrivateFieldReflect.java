package reflectionEx;

import java.lang.reflect.Field;

public class PrivateFieldReflect {
    public static void main(String[] args) {
        Class<FieldProvider> clazz = FieldProvider.class;
        try {
            clazz.getDeclaredField("field2").setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        Field[] fileds = clazz.getDeclaredFields();


    }

}

class FieldProvider{
    public int field1;
    private int field2;

    private FieldProvider(){};
}
