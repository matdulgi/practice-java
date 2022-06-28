package threadTest;

public class shutdownHookTest {
    /** what will be happened when exit signal send
     *
     * will it retain while shutdown hook method is executing?
     * conclusion : all thread is live until shutdown hook method be closed
     */

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("shutdownHook method started");
                try {
                    Thread.sleep(10000);
                    System.out.println("shutdownHook method finished");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }));

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("thread 1 running");
                    try {
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
                while(true) {
                    System.out.println("thread 2 running");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        while(true) {
            System.out.println("main thread running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


//        System.exit(1);
    }
}
