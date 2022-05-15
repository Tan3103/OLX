package Class;

import java.io.Serializable;

public class Animal extends Item implements Serializable {
    private String breed;
    private int age;

    public Animal() {
    }

    public Animal(Integer id, String name, String type, int price, String breed, int age) {
        super(id, name, type, price);
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
