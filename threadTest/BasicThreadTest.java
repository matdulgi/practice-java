package threadTest;

import java.util.concurrent.atomic.AtomicInteger;

public class BasicThreadTest {
    /** when will new Thread create?
     *
     */
    static int i = 0;
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
//                        System.out.println(ai.get());
//                        ai.set(ai.get()+1);
                        System.out.println(i++);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
//                        System.out.println(ai.get());
//                        ai.set(ai.get()+1);
                        System.out.println(i++);
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


//        System.out.println("");
//        Thread thread1 = new Thread();
//        Thread thread2 = new Thread(threadClass);
//
//        Runtime.getRuntime().addShutdownHook(new Thread());

    }
}

