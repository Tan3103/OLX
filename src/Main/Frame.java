package Main;

import Menu.*;
import Menu.MainMenu;
import javax.swing.*;

public class Frame extends JFrame {
    public static MainMenu mainMenu;
    public static Login login;
    public static SignUp signUp;
    public static UserMenu userMenu;

    public Frame() {
        setSize(500, 500);
        setTitle("OLX");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        mainMenu = new MainMenu();
        mainMenu.setLocation(0, 0);
        add(mainMenu);

        login = new Login();
        login.setLocation(0, 0);
        login.setVisible(false);
        add(login);

        signUp = new SignUp();
        signUp.setLocation(0, 0);
        signUp.setVisible(false);
        add(signUp);

        userMenu = new UserMenu();
        userMenu.setLocation(0, 0);
        userMenu.setVisible(false);
        add(userMenu);
    }
}
