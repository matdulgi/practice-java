package extendsTest;

public class ConsturctorTest {
    public static void main(String[] args) {
        /* topic
        * how to constructors are called and work for extends
        * theme 1 : basic works with super method declaration
        *
        * theme 2 : works on super methods declaration omitted
        *
        * conclusion : to call parent class's  argument constructor, it needs to call super method that has same argument format
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


class Parent2{
    public Parent2(){
        System.out.println("called Parent's consturctor - non arg");
    }
    public Parent2(Object obj){
        System.out.println("called Parent's consturctor - obj");
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
