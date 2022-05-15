package Class;

import java.io.Serializable;

public class ClothingShoes extends Item implements Serializable, Info {
    private String size;

    public ClothingShoes(Integer id, String name, int price, String size) {
        super(id, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String info() {
        return getId() + ") " + getName() + ", Price:" + getPrice() + ", size:" + size ;
    }
}
