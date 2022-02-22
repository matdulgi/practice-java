package innerClassTest;

import innerClassTest.OuterClass.InnerClass;

/** subject basic InnerClassTest
 * # test1
 *
 *
 * # test2
 *
 * # test3
 *
 */
public class BasicInnerClassTest {
    static OuterClass outerClass = new OuterClass();
    static InnerClass innerClass = outerClass.new InnerClass();

    public static void main(String[] args) {
        System.out.println("main method start");
    }


}



    class OuterClass {
        InnerClass innerClass = new InnerClass();

        class InnerClass {
            InnerClass() {
                System.out.println("it's inner class");

            }
        }
    }



