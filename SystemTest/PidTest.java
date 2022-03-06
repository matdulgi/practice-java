package SystemTest;

import java.lang.management.ManagementFactory;

public class PidTest {
    public static void main(String[] args) {
        System.out.println("java pid : "+ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
