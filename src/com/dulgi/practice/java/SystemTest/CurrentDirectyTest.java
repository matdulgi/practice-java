package SystemTest;

public class CurrentDirectyTest {
    public static void main(String[] args) {
        //get Current directory
        System.out.println("current directory : " + System.getProperty("user.dir"));
        //current directory is program's root directory
        //java command must be executed at root directory
    }
}
