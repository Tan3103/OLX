package DataB;
import Class.*;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
    private String login;
    private User user;
    private int id;
    private ArrayList<User> users;
    private ArrayList<Item> items;
    private ArrayList<Realty> realties;
    private ArrayList<ClothingShoes> clothingShoes;
    private ArrayList<Animal> animals;
    private Item item;
    private Realty realty;
    private ClothingShoes clothingShoe;
    private Animal animal;

    public PackageData() {
    }

    public PackageData(String operationType, User user, int id) {
        this.operationType = operationType;
        this.user = user;
        this.id = id;
    }

    public PackageData(String operationType, Realty realty, User user) {
        this.operationType = operationType;
        this.user = user;
        this.realty = realty;
    }

    public PackageData(String operationType,ClothingShoes clothingShoe, User user) {
        this.operationType = operationType;
        this.user = user;
        this.clothingShoe = clothingShoe;
    }

    public PackageData(String operationType, Animal animal, User user) {
        this.operationType = operationType;
        this.user = user;
        this.animal = animal;
    }

    public PackageData(String operationType, Realty realty) {
        this.operationType = operationType;
        this.realty = realty;
    }

    public PackageData(String operationType, ClothingShoes clothingShoe) {
        this.operationType = operationType;
        this.clothingShoe = clothingShoe;
    }

    public PackageData(String operationType, Animal animal) {
        this.operationType = operationType;
        this.animal = animal;
    }

    public PackageData(String operationType, int id) {
        this.operationType = operationType;
        this.id = id;
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

    public PackageData(String operationType) {
        this.operationType = operationType;
    }

    public PackageData(String operationType, String login) {
        this.operationType = operationType;
        this.login = login;
    }

    public PackageData(String operationType, User user, Item item) {
        this.operationType = operationType;
        this.user = user;
        this.item = item;
    }

    public PackageData(User user, Item item) {
        this.user = user;
        this.item = item;
    }

    public PackageData(Item item) {
        this.item = item;
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

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Realty getRealty() {
        return realty;
    }

    public void setRealty(Realty realty) {
        this.realty = realty;
    }

    public ClothingShoes getClothingShoe() {
        return clothingShoe;
    }

    public void setClothingShoe(ClothingShoes clothingShoe) {
        this.clothingShoe = clothingShoe;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
