package Server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(8484);
            while(true){
                System.out.println("---------------");
                Socket socket = serverSocket.accept();
                System.out.println("Connected");
                SThread st = new SThread(socket);
                st.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
