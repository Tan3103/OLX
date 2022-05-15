package Server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Package;
import java.net.Socket;
import Class.*;
import DataB.*;

public class SThread extends Thread {
    private Socket socket;

    public SThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try{
            DBManager manager = new DBManager();
            manager.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            Package pg = null;


            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
