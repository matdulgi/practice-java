package nestedClassEx.staticNestedClassEx;

public class StaticNestedClassEx {
    public static void main(String[] args) {
        for (int i = 0;i < 100; i ++ ){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    TestEntity.Target target = new TestEntity.Target();
                    System.out.println( target.var++ );
                }
            }).run();
        }
    }
}

class TestEntity {
    static class Target{
        int var = 0;
    }
}

