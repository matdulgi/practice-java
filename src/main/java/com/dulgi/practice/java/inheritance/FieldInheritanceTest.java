package inheritanceTest;

public class FieldInheritanceTest {

    /** test1 : inheritance of field
     *
     *  test2 : get Chileren's field with parent's method
     *  result : failed
     *
     *  test2 : is overridden field point to same address as parent?
     *
     *  test3 : Access Modifier of overridden field
     */


    public static void main(String[] args) {
        /**
         * children into parent
         */
        Parent parent = new Children();
        System.out.println(parent.field);
        parent.showInfo();



        Children children = (Children)parent;


        System.out.println("------");
        parent.setField(3);
        System.out.println(parent.field);
        System.out.println(children.field);
        System.out.println(children.getField());

    }

    static class Parent {
        public int field = 1;

        public int getField() {
            return field;
        }

        public void setField(int field) {
            this.field = field;
        }
        public void showInfo(){

            System.out.println("it's parent");
        }
    }

    static class Children extends Parent{
        public int field = 2;
        Children (){
//         super.field = field;
        }

        public int getField(){
            return super.field;
        }
        public void showInfo(){
            System.out.println("it's children");
        }
    }


}