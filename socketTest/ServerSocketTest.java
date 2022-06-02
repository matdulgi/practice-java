import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1{
    public  static void main(String args[]){
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(10223);

            try (Socket socket = serverSocket.accept()) {
                while(true){
                    InputStream inputStream = socket.getInputStream();
                    InputStreamReader reader = new InputStreamReader(inputStream);
                    int i;
                    while((i=reader.read())!= -1){
                        System.out.print((char)i);
                        System.out.print('!');
                    }

                }
            } catch (IOException e) {
                
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}