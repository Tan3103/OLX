package DataB;
import Class.*;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
    private String login;
    private User user;
    private int id;
    private int id2;
    private ArrayList<User> users;
    private ArrayList<Item> items;
    private ArrayList<Realty> realties;
    private ArrayList<ClothingShoes> clothingShoes;
    private ArrayList<Animal> animals;

    public PackageData() {
    }

    public PackageData(String operationType, int id) {
        this.operationType = operationType;
        this.id = id;
    }

    public PackageData(String operationType, int id, int id2) {
        this.operationType = operationType;
        this.id = id;
        this.id2 = id2;
    }

    public PackageData(int id) {
        this.id = id;
    }

    public PackageData(User user) {
        this.user = user;
    }

    public PackageData(String operationType, User user) {
        this.operationType = operationType;
        this.user = user;
    }

    public PackageData(int id, int id2) {
        this.id = id;
        this.id2 = id2;
    }

    public PackageData(String operationType) {
        this.operationType = operationType;
    }

    public PackageData(String operationType, String login) {
        this.operationType = operationType;
        this.login = login;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Realty> getRealties() {
        return realties;
    }

    public void setRealties(ArrayList<Realty> realties) {
        this.realties = realties;
    }

    public ArrayList<ClothingShoes> getClothingShoes() {
        return clothingShoes;
    }

    public void setClothingShoes(ArrayList<ClothingShoes> clothingShoes) {
        this.clothingShoes = clothingShoes;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
