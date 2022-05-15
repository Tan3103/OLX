package DataB;
import Class.*;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
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
}
