package Menu;

import DataB.PackageData;
import Main.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAds extends Container {
    public static JTextArea textArea;
    public MyAds(){
        setSize(500, 500);
        setLayout(null);

        JButton realtyButton = new JButton("Realty");
        realtyButton.setBounds(70, 50, 360, 25);
        add(realtyButton);

        JButton CSButton = new JButton("Clothing/Shoes");
        CSButton.setBounds(70, 80, 360, 25);
        add(CSButton);

        JButton AnimalButton = new JButton("Animal");
        AnimalButton.setBounds(70, 110, 360, 25);
        add(AnimalButton);

        textArea = new JTextArea();
        textArea.setBounds(70, 145, 360, 170);
        add(textArea);
        textArea.setText(null);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(70, 360, 360, 30);
        add(backButton);

        realtyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);

                PackageData pd = new PackageData("LIST MY REALTY", Login.user);
                Main.connect(pd);
            }
        });

        CSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);

                PackageData pd = new PackageData("LIST MY CS", Login.user);
                Main.connect(pd);
            }
        });

        AnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);

                PackageData pd = new PackageData("LIST MY ANIMAL", Login.user);
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
