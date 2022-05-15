package Class;

import java.io.Serializable;

public class ClothingShoes extends Item implements Serializable {
    private String size;

    public ClothingShoes() {
    }

    public ClothingShoes(Integer id, String name, String type, int price, String size) {
        super(id, name, type, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
