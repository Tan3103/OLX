package Menu;
import Main.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserMenu extends Container {
    public UserMenu(){
        setSize(500, 500);
        setLayout(null);

        JButton mainButton = new JButton("Main headings");
        mainButton.setBounds(100, 70, 300, 40);
        add(mainButton);

        JButton addRealtyButton = new JButton("Realty");
        addRealtyButton.setBounds(100, 120, 300, 40);
        add(addRealtyButton);

        JButton addCSButton = new JButton("Clothing/Shoes");
        addCSButton.setBounds(100, 120, 300, 40);
        add(addCSButton);

        JButton addAnimalButton = new JButton("Animal");
        addAnimalButton.setBounds(100, 120, 300, 40);
        add(addAnimalButton);

        JButton purchasesButton = new JButton("My purchases");
        purchasesButton.setBounds(100, 170, 300, 40);
        add(purchasesButton);

        JButton adsButton = new JButton("My ads");
        adsButton.setBounds(100, 170, 300, 40);
        add(adsButton);

        JButton deleteButton = new JButton("Delete my ads");
        deleteButton.setBounds(100, 220, 300, 40);
        add(deleteButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(100, 270, 300, 40);
        add(backButton);

        mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.mainHeadings.setVisible(true);
            }
        });

        addRealtyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.addRealty.setVisible(true);
            }
        });

        addCSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.addCS.setVisible(true);
            }
        });

        addAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.addAnimal.setVisible(true);
            }
        });

        purchasesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.myPurchases.setVisible(true);
            }
        });

        adsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.myAds.setVisible(false);
                Frame.myAds.setVisible(true);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.deleteMyAds.setVisible(true);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.mainMenu.setVisible(true);
            }
        });
    }
}
