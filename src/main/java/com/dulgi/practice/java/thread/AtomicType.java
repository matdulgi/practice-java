package threadTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicType {

    //static int는 모든 곳에서 공유된다
    static int si = 0;


    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(1);
        int i = 0;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
//                        System.out.println(i++);
//                        atomic test
                        System.out.println(ai.get());
                        ai.set(ai.get()+1);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
//                        System.out.println(i++);
                        //atomic test
                        System.out.println(ai.get());
                        ai.set(ai.get()+1);
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }
}
