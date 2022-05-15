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
        mainButton.setBounds(100, 100, 300, 40);
        add(mainButton);

        JButton addAdButton = new JButton("Add an ad");
        addAdButton.setBounds(100, 150, 145, 40);
        add(addAdButton);

        JButton deleteButton = new JButton("Delete my ads");
        deleteButton.setBounds(255, 150, 145, 40);
        add(deleteButton);

        JButton purchasesButton = new JButton("My purchases");
        purchasesButton.setBounds(100, 200, 300, 40);
        add(purchasesButton);

        JButton adsButton = new JButton("My ads");
        adsButton.setBounds(100, 250, 300, 40);
        add(adsButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(100, 300, 300, 40);
        add(backButton);

        mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.mainHeadings.setVisible(true);
            }
        });

        addAdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.addAd.setVisible(true);
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
