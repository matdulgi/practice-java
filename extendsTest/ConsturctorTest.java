package extendsTest;

public class ConsturctorTest {
    public static void main(String[] args) {
        /* topic
        * how to constructors are called and work for extends
        * theme 1 : basic works with super method declaration
        *
        * theme 2 : works on super methods declaration omitted
        *
        * conclusion 1 : to call parent class's  argument constructor(parameterized constructor), it needs to call super method that has same argument format
        *
        * theme 3 : will construct be inherited
        * to create children class with argument, children class must has it's own artument constructor
        * note : Constructors are not inherited!
        *
        * theme 4 : prevent default constructor
        * to allow only argument constructor, must do not declare or set to private the non argument constructor
        *
        * remains
        */
        //no arg
        System.out.println(" - start to create new Children class with no arg");
        Children1 children1 = new Children1();
        System.out.println(" - start to create new Children class with no arg");
        Children1 children1_arg = new Children1(new Object());
        // with no super method that has argument declaration, parent's default constructor has called

        System.out.println(" - start to create new Children class with no arg");
        Children2 children2_arg = new Children2(new Object());

        System.out.println(" - start to create new Children class that has no argument constructor");
        Children3 children3 = new Children3();
//        Children3 children3_arg = new Children3(new Object());


        Parent2 parent2 = new Parent2(new Object());
    }
}

class Parent1{
    public Parent1(){
        System.out.println("called Parent's consturctor - non arg");
    }
    public Parent1(Object obj){
        System.out.println("called Parent's consturctor - obj");
    }
}

class Children1 extends Parent1{
    public Children1(){
        System.out.println("called Children's consturctor - non arg");
    }
    public Children1(Object obj){
        System.out.println("called Childrun's consturctor - obj");
    }
}

class Children2 extends Parent1{
    public Children2(){
        System.out.println("called Children's consturctor - non arg");
    }
    public Children2(Object obj){
        super(obj);
        System.out.println("called Childrun's consturctor - obj");
    }
}

class Children3 extends Parent1{
}

class Parent2{
    private Parent2(){
        System.out.println("called Parent's consturctor - non arg");
    }
    public Parent2(Object obj){
        System.out.println("called Parent's consturctor - obj");
    }
}

class Children4 extends Parent2{
    public Children4(Object obj){
        super(obj);

    }

}
