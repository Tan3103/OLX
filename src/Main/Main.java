package Main;
import Class.*;
import DataB.PackageData;
import Menu.Login;
import Menu.MainHeadings;
import Menu.MyAds;
import Menu.MyPurchases;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;


public class Main {
    public static Frame frame;

    public static void connect(PackageData pg){
        try{
            Socket socket = new Socket("127.0.0.1", 8484);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            if(pg.getOperationType().equals("ADD USER") || pg.getOperationType().equals("ADD CART") || pg.getOperationType().equals("DELETE ITEM") ||
                    pg.getOperationType().equals("ADD REALTY") ||pg.getOperationType().equals("ADD CS") ||
                    pg.getOperationType().equals("ADD ANIMAL")){
                outputStream.writeObject(pg);
            }
            else if(pg.getOperationType().equals("GET USER")){
                outputStream.writeObject(pg);
                PackageData packageData = (PackageData)inputStream.readObject();

                User user = packageData.getUser();
                Login.user = user;
            }
            else if(pg.getOperationType().equals("LIST REALTY")){
                outputStream.writeObject(pg);
                PackageData packageData = (PackageData)inputStream.readObject();
                ArrayList<Realty> arrayList = packageData.getRealties();
                String s = "";

                for(int i=0; i< arrayList.size(); i++){
                    s += arrayList.get(i).info() + "\n";
                }
                MainHeadings.textArea.append(s);
            }
            else if(pg.getOperationType().equals("LIST CS")){
                outputStream.writeObject(pg);
                PackageData packageData = (PackageData)inputStream.readObject();
                ArrayList<ClothingShoes> arrayList = packageData.getClothingShoes();
                String s = "";

                for(int i=0; i< arrayList.size(); i++){
                    s += arrayList.get(i).info() + "\n";
                }
                MainHeadings.textArea.append(s);
            }
            else if(pg.getOperationType().equals("LIST ANIMAL")){
                outputStream.writeObject(pg);
                PackageData packageData = (PackageData)inputStream.readObject();
                ArrayList<Animal> arrayList = packageData.getAnimals();
                String s = "";

                for(int i=0; i< arrayList.size(); i++){
                    s += arrayList.get(i).info() + "\n";
                }
                MainHeadings.textArea.append(s);
            }
            else if(pg.getOperationType().equals("LIST MY REALTY")){
                outputStream.writeObject(pg);
                PackageData packageData = (PackageData)inputStream.readObject();
                ArrayList<Realty> arrayList = packageData.getRealties();
                String s = "";

                for(int i=0; i< arrayList.size(); i++){
                    s += arrayList.get(i).info() + "\n";
                }
                MyAds.textArea.append(s);
            }
            else if(pg.getOperationType().equals("LIST MY CS")){
                outputStream.writeObject(pg);
                PackageData packageData = (PackageData)inputStream.readObject();
                ArrayList<ClothingShoes> arrayList = packageData.getClothingShoes();
                String s = "";

                for(int i=0; i< arrayList.size(); i++){
                    s += arrayList.get(i).info() + "\n";
                }
                MyAds.textArea.append(s);
            }
            else if(pg.getOperationType().equals("LIST MY ANIMAL")){
                outputStream.writeObject(pg);
                PackageData packageData = (PackageData)inputStream.readObject();
                ArrayList<Animal> arrayList = packageData.getAnimals();
                String s = "";

                for(int i=0; i< arrayList.size(); i++){
                    s += arrayList.get(i).info() + "\n";
                }
                MyAds.textArea.append(s);
            }
            else if(pg.getOperationType().equals("LIST CART")){
                outputStream.writeObject(pg);
                PackageData packageData = (PackageData)inputStream.readObject();
                ArrayList<Item> arrayList = packageData.getItems();
                String s = "";

                for(int i=0; i< arrayList.size(); i++){
                    s += arrayList.get(i).info() + "\n";
                }
                MyPurchases.textArea.append(s);
            }
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
