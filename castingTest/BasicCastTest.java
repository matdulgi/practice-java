package castingTest;

import javax.sound.sampled.SourceDataLine;

public class BasicCastTest{
    public static void main (String[] args){
        Parent parent = new Children();
        parent.test();
        parent.parent();
        //overrided method is applied
        //but, cannot invoke children's own method
        if (parent instanceof Children){
            Children children = (Children)parent;
            children.children();
        }
        //it needs to declare for children's type
    }

}

class Parent{
    public void test(){
        System.out.println("it's parent");
    }
    public void parent(){
        System.out.println("parent");
    }

}

class Children extends Parent{
    @Override
    public void test(){
        System.out.println("it's children");
    }
    public void children(){
        System.out.println("children");
    }
}