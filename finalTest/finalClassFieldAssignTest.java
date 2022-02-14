package finalTest;

import java.util.ArrayList;
import java.util.List;


public class finalClassFieldAssignTest {
    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        testClass.addList();
        testClass.addList();
        testClass.addList();
        System.out.println(testClass.getList());
        // final object variable's imutable thing is it's address(stack memory), not a content(heap memory)
    }
}

class TestClass{
    private final List<String> list;
    private int i = 0;

    public TestClass(){
        list = new ArrayList<>();
    }

    public void addList(){
        list.add("" + i++);
    }
    public List<String> getList(){
        return list;
    }
    public void changeList(){
        // list = new ArrayList<>();
    }
}
