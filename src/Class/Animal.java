package Class;

import java.io.Serializable;

public class Animal extends Item implements Serializable, Info {
    private String breed;
    private int age;

    public Animal() {
    }

    public Animal(Integer id, String name, int price, String breed, int age) {
        super(id, name, price);
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

    @Override
    public String info() {
        return getId() + ") " + getName() + ", Price:" + getPrice() + ", breed:" + breed + ", age:" + age ;
    }
}
