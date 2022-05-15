package Class;

import java.io.Serializable;

public class ClothingShoes extends Item implements Serializable {
    private String condition;
    private String size;

    public ClothingShoes() {
    }

    public ClothingShoes(Integer id, String name, String type, int price, String condition, String size) {
        super(id, name, type, price);
        this.condition = condition;
        this.size = size;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
