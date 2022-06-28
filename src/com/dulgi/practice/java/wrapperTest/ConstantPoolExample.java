package wrapperTest;

public class ConstantPoolExample {
    public static void main(String[] args) {
        // created by constructor
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2); // false

        // assigned by valueOf method
        i1 = Integer.valueOf(127);
        i2 = Integer.valueOf(127);
        System.out.println(i1 == i2); // true
        // valueOf method returns the reference of constant pool

        // auto boxing
        i1 = 126;
        i2 = 126;
        System.out.println(i1 == i2); // true

        i1 = 125;
        i2 = Integer.valueOf(125);
        System.out.println(i1 == i2); // true
        // assign primitive invokes Integer.valueOf method

        // out of cache range
        i1 = Integer.valueOf(129);
        i2 = Integer.valueOf(129);
        System.out.println(i1 == i2); // false



    }
}

