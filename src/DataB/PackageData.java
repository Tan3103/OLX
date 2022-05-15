package DataB;
import Class.*;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
    private String login;
    private User user;
    private ArrayList<User> users;

    public PackageData() {
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
}
