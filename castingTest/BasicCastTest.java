package castingTest;

public class BasicCastTest{
    public static void main (String[] args){
        Parent parent = new Children();
        parent.test();
    }

}

class Parent{
    public void test(){
        System.out.println("it's parent");
    }

}

class Children extends Parent{
    @Override
    public void test(){
        System.out.println("it's children");
    }
}