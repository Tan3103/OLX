package DataB;
import Class.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    public static Connection connection = null;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/newnew?useUnicode=true&serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addUser(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO user (id, email, password, name, surname) " +
                    "VALUES (NULL, ?, ?, ?, ?)");
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getSurname());
            statement.executeUpdate();

            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public User getUser(String emaill){
        User user = new User();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM user WHERE email = '" + emaill + "'");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                user = new User(id, email, password, name, surname);
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public ArrayList<Realty> getAllRealty(){
        ArrayList<Realty> List = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM item WHERE typeID = 1");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                int price = resultSet.getInt("price");
                int numberRooms = resultSet.getInt("numberRooms");
                double square = resultSet.getInt("square");

                List.add(new Realty(id,  name, type, price, numberRooms, square));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return List;
    }

    public ArrayList<ClothingShoes> getAllCS(){
        ArrayList<ClothingShoes> List = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM item WHERE typeID = 2");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                int price = resultSet.getInt("price");
                String numberRooms = resultSet.getString("size");

                List.add(new ClothingShoes(id,  name, type, price, numberRooms));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return List;
    }

    public ArrayList<Animal> getAllAnimal(){
        ArrayList<Animal> List = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM item WHERE typeID = 3");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                int price = resultSet.getInt("price");
                String breed = resultSet.getString("breed");
                int age = resultSet.getInt("age");

                List.add(new Animal(id,  name, type, price, breed, age));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return List;
    }

    public void deleteItem(Integer id){
        try{
            PreparedStatement statement = connection.prepareStatement("" + "DELETE FROM item WHERE id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addCart(Integer user_id, Integer item_id) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO cart (id, userID, itemID) " +
                    "VALUES (NULL, ?, ?)");
            statement.setInt(1,user_id);
            statement.setInt(2, item_id);

            statement.executeUpdate();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Item> getAllCart(Integer idd){
        ArrayList<Item> productList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM cart WHERE userID = '" + idd + "'");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int name = resultSet.getInt("product_id");
                productList.add(getItem(name));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return productList;
    }

    public Item getItem(Integer idd){
        Item item = new Item();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM item WHERE id = '" + idd + "'");
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                int price = resultSet.getInt("price");
                item = new Item(id, type, name, price);
            }

            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return item;
    }
}
