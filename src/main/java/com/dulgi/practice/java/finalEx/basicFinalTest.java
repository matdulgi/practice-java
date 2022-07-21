package finalTest;

public class basicFinalTest {
    /**
     * final field must be assigned as the instance of class created
     */
    public static void main(String[] args) {

    }

    class TestClass{
       ClassWithFinalField classWithFinalField = new ClassWithFinalField();
    }

    class ClassWithFinalField {
        final int field1;
        final TestType field2;

        /** case 1.
         * assign with new keyword
         */
        ClassWithFinalField(){
            this.field1 = 1;
            this.field2 = new TestType();

            /**
             * reflection not supported
             */
//            try {
//                this.field1 = TestType.class.newInstance();
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
        }

        /**
         * case 2.
         * assign with parameter
         */
        ClassWithFinalField(int filed1, TestType field2) {
            this.field1 = filed1;
            this.field2 = field2;
        }
    }

    class TestType{

    }
}

