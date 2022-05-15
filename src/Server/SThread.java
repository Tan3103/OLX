package Server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Package;
import java.net.Socket;
import java.util.ArrayList;

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

            PackageData pd = null;
            while((pd = ((PackageData)inputStream.readObject())) != null) {
                if (pd.getOperationType().equals("ADD USER")) {
                    User user = pd.getUser();
                    manager.addUser(user);
                    break;
                }
                else if(pd.getOperationType().equals("GET USER")){
                    User user = manager.getUser(pd.getLogin());
                    PackageData packageData = new PackageData(user);
                    outputStream.writeObject(packageData);
                    break;
                }
                else if(pd.getOperationType().equals("GET ITEM")){
                    Item item = manager.getItem(pd.getId());
                    PackageData packageData = new PackageData(item);
                    outputStream.writeObject(packageData);
                    break;
                }
                else if(pd.getOperationType().equals("LIST REALTY")){
                    ArrayList<Realty> array = manager.getAllRealty(pd.getUser());
                    PackageData packageData = new PackageData();
                    packageData.setRealties(array);
                    outputStream.writeObject(packageData);
                    break;
                }
                else if(pd.getOperationType().equals("LIST CS")){
                    ArrayList<ClothingShoes> array = manager.getAllCS(pd.getUser());
                    PackageData packageData = new PackageData();
                    packageData.setClothingShoes(array);
                    outputStream.writeObject(packageData);
                    break;
                }
                else if(pd.getOperationType().equals("LIST ANIMAL")){
                    ArrayList<Animal> array = manager.getAllAnimal(pd.getUser());
                    PackageData packageData = new PackageData();
                    packageData.setAnimals(array);
                    outputStream.writeObject(packageData);
                    break;
                }
                else if(pd.getOperationType().equals("ADD CART")){
                    manager.addCart(pd.getUser(), pd.getItem());
                    break;
                }
                else if(pd.getOperationType().equals("LIST CART")){
                    ArrayList<Item> array = manager.getAllCart(pd.getUser());
                    PackageData packageData = new PackageData();
                    packageData.setItems(array);
                    outputStream.writeObject(packageData);
                    break;
                }
                else if(pd.getOperationType().equals("DELETE ITEM")){
                    int id = pd.getId();
                    manager.deleteItem(id);
                    break;
                }
                else if (pd.getOperationType().equals("ADD REALTY")) {
                    Realty realty = pd.getRealty();
                    User user = pd.getUser();
                    manager.addRealty(realty, user);
                    break;
                }
                else if (pd.getOperationType().equals("ADD CS")) {
                    ClothingShoes clothingShoes = pd.getClothingShoe();
                    User user = pd.getUser();
                    manager.addCS(clothingShoes, user);
                    break;
                }
                else if (pd.getOperationType().equals("ADD ANIMAL")) {
                    Animal animal = pd.getAnimal();
                    User user = pd.getUser();
                    manager.addAnimal(animal, user);
                    break;
                }
                else if(pd.getOperationType().equals("LIST MY REALTY")){
                    ArrayList<Realty> array = manager.getMyRealty(pd.getUser());
                    PackageData packageData = new PackageData();
                    packageData.setRealties(array);
                    outputStream.writeObject(packageData);
                    break;
                }
                else if(pd.getOperationType().equals("LIST MY CS")){
                    ArrayList<ClothingShoes> array = manager.getMyCS(pd.getUser());
                    PackageData packageData = new PackageData();
                    packageData.setClothingShoes(array);
                    outputStream.writeObject(packageData);
                    break;
                }
                else if(pd.getOperationType().equals("LIST MY ANIMAL")){
                    ArrayList<Animal> array = manager.getMyAnimal(pd.getUser());
                    PackageData packageData = new PackageData();
                    packageData.setAnimals(array);
                    outputStream.writeObject(packageData);
                    break;
                }
            }
            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
