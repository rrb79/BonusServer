package Main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static final int SERVER_PORT = 6900;

    public void Server(){
        ServerSocket serverSocket= null;
        try {
            serverSocket = new ServerSocket(SERVER_PORT);
            Socket socket=serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }

}
}
