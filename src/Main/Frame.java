package Main;

import Menu.*;
import Menu.MainMenu;
import javax.swing.*;

public class Frame extends JFrame {
    public static MainMenu mainMenu;
    public static Login login;
    public static SignUp signUp;
    public static UserMenu userMenu;
    public static MainHeadings mainHeadings;
    public static AddRealty addRealty;
    public static AddCS addCS;
    public static AddAnimal addAnimal;
    public static MyPurchases myPurchases;
    public static MyAds myAds;
    public static DeleteMyAds deleteMyAds;
    public static AddAd addAd;

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

        mainHeadings = new MainHeadings();
        mainHeadings.setLocation(0, 0);
        mainHeadings.setVisible(false);
        add(mainHeadings);

        addRealty = new AddRealty();
        addRealty.setLocation(0, 0);
        addRealty.setVisible(false);
        add(addRealty);

        addCS = new AddCS();
        addCS.setLocation(0, 0);
        addCS.setVisible(false);
        add(addCS);

        addAnimal = new AddAnimal();
        addAnimal.setLocation(0, 0);
        addAnimal.setVisible(false);
        add(addAnimal);


        myPurchases = new MyPurchases();
        myPurchases.setLocation(0, 0);
        myPurchases.setVisible(false);
        add(myPurchases);

        myAds = new MyAds();
        myAds.setLocation(0, 0);
        myAds.setVisible(false);
        add(myAds);

        deleteMyAds = new DeleteMyAds();
        deleteMyAds.setLocation(0, 0);
        deleteMyAds.setVisible(false);
        add(deleteMyAds);

        addAd = new AddAd();
        addAd.setLocation(0, 0);
        addAd.setVisible(false);
        add(addAd);
    }
}
