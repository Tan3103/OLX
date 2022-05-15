package Main;
import Class.*;
import DataB.PackageData;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Main {
    public static Frame frame;

    public static void connect(PackageData pg){
        try{
            Socket socket = new Socket("127.0.0.1", 8484);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            /*if(pg.getOperationType().equals("ADD USER") || pg.getOperationType().equals("ADD PHONE") || pg.getOperationType().equals("DELETE PHONE")){
                outputStream.writeObject(pg);
            }
            else if(pg.getOperationType().equals("GET USER")){
                outputStream.writeObject(pg);
                Package infoFromServer = (Package)inputStream.readObject();

                User user = infoFromServer.getUser();
                LoginMenu.user = user;
            }
            else if(pg.getOperationType().equals("LIST MY PHONE")){
                outputStream.writeObject(pg);
                Package infoFromServer = (Package)inputStream.readObject();
                ArrayList<PhoneNumbers> arrayListFromServer = infoFromServer.getPhoneNumbersArrayList();
                String s = "";

                for(int i=0; i< arrayListFromServer.size(); i++){
                    s += arrayListFromServer.get(i).info() + "\n";
                }
                DeleteMenu.textArea.append(s);
                MyListMenu.textArea.append(s);
            }*/
            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
    }
}
