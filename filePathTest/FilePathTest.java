package filePathTest;


import org.springframework.core.io.Resource;

import java.io.File;
import java.net.URL;

public class FilePathTest {
    public static void main(String[] args) {
        //Relative Pass - from root directory  : successed
        File file1 = new File("filePathtest/testFile1");
        System.out.println(file1.exists());
        URL url;
        Resource resource;

        File file2 = new File("**/testFile1");
        System.out.println(file2.exists());
    }
}
