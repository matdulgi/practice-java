package socketTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerClientSocketTest {
    public final static int SERVER_SOCKET_PORT = 10223;

    public static void main(String args[]) {

        Thread serverThread = new Thread(() -> {
//            this socket will run as server
            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(ServerClientSocketTest.SERVER_SOCKET_PORT);

                Socket socket = serverSocket.accept();
//                System.out.println("server socket created " + serverSocket.);
                System.out.println("server socket created " + socket.toString());
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                while (true) {
                    System.out.println(reader.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        serverThread.start();

        try (Socket socket = new Socket("localhost", SERVER_SOCKET_PORT) ) {
            System.out.println("client socket created" + socket.toString());
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            Scanner scanner = new Scanner(System.in);

            while(true) {
//                System.out.print(" > ");
//                reader's nextLine method requires \n, but Scanner's nextLine eliminate \n character
                writer.write(scanner.nextLine() + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

    }
}