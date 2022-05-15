package Class;

import java.io.Serializable;

public class Realty extends Item implements Serializable {
    private int numberRooms;
    private double square;

    public Realty() {
    }

    public Realty(Integer id, String name, String type, int price, int numberRooms, double square) {
        super(id, name, type, price);
        this.numberRooms = numberRooms;
        this.square = square;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
