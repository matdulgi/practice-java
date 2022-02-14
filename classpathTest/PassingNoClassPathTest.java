//package classpathTest;
//
//
//import org.springframework.core.io.AbstractResource;
//import org.springframework.core.io.Resource;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//public class PassingNoClassPathTest {
//    public static void main(String[] args) {
//        Resource resource = new AbstractResource() {
//            @Override
//            public String getDescription() {
//                return "testResource";
//            }
//
//            @Override
//            public InputStream getInputStream() throws IOException {
//                return null;
//            }
//        };
//        System.out.println(resource.getDescription());
//    }
//
//}
