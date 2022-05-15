package Menu;
import Class.*;
import DataB.DBManager;
import DataB.PackageData;
import Main.Main;
import Main.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import static DataB.DBManager.connection;

public class Login extends Container {
    public static User user;
    public Login(){
        setSize(500, 500);
        setLayout(null);

        JLabel loginLabel = new JLabel("LOGIN:");
        loginLabel.setBounds(100, 100, 100, 30);
        add(loginLabel);

        JTextField loginField = new JTextField();
        loginField.setBounds(200, 100, 200, 30);
        add(loginField);

        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setBounds(100, 150, 100, 30);
        add(passwordLabel);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(200, 150, 200, 30);
        add(passwordField);

        JButton logInButton = new JButton("LOGIN");
        logInButton.setBounds(100, 200, 140, 40);
        add(logInButton);

        JButton backButton = new JButton("BACK TO MENU");
        backButton.setBounds(250, 200, 150, 40);
        add(backButton);

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    DBManager result = new DBManager();
                    result.connect();
                    Statement stmt = connection.createStatement();
                    String sql = "SELECT * FROM  user WHERE email='"  + loginField.getText() + "' AND password='" + passwordField.getText() +  "' ";
                    ResultSet rs = stmt.executeQuery(sql);

                    PackageData pd = new PackageData("GET USER", loginField.getText());
                    Main.connect(pd);

                    if(rs.next()){
                        Frame.login.setVisible(false);
                        Frame.userMenu.setVisible(true);
                    }
                } catch(Exception a){
                    a.printStackTrace();
                }
                loginField.setText(null);
                passwordField.setText(null);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.login.setVisible(false);
                Frame.mainMenu.setVisible(true);
            }
        });
    }
}
