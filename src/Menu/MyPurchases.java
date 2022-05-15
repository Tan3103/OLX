package Menu;

import DataB.PackageData;
import Main.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPurchases extends Container {
    public static JTextArea textArea;
    public MyPurchases(){
        setSize(500, 500);
        setLayout(null);

        JButton listButton = new JButton("LIST");
        listButton.setBounds(70, 50, 360, 25);
        add(listButton);

        textArea = new JTextArea();
        textArea.setBounds(70, 145, 360, 170);
        add(textArea);
        textArea.setText(null);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(255, 360, 175, 30);
        add(backButton);

        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);

                PackageData pd = new PackageData("LIST CART", Login.user);
                Main.connect(pd);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.myAds.setVisible(false);
                Main.frame.userMenu.setVisible(true);
            }
        });
    }
}
