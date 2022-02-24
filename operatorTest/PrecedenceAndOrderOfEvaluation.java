package operatorTest;

public class PrecedenceAndOrderOfEvaluation {
    public static void main(String[] args) {

        /** assignment order test
         *
         * (2+3)*4 = 20
         * 2+3*4 = 14
         */
        String str = "a";
        System.out.println(str += "b" + "c");

        int a = 2;
        int b = 4;
        System.out.println(a+=3*4);
        System.out.println(b*=3+2);
    }
}
