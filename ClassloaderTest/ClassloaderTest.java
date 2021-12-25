package ClassloaderTest;

import java.net.URL;


public class ClassloaderTest {
    public static void main(String[] args) {
        MyClassloader myClassloader = new MyClassloader();
        ClassLoader myClassloader2 = new ClassLoader() {
//        @Override
//        public URL getResource(String name) {
//            return super.getResource(name);
//        }
        };
        Class testClass = myClassloader.getClass();


    }
}
