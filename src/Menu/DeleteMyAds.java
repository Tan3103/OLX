package Menu;

import DataB.PackageData;
import Main.Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteMyAds extends Container {
    public static JTextArea textArea;
    public DeleteMyAds(){
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

        JLabel label = new JLabel("Enter the number of the item you want to delete:");
        label.setBounds(70, 320, 280, 25);
        add(label);

        JTextField numberField = new JTextField();
        numberField.setBounds(360, 320, 70, 25);
        add(numberField);

        JButton deleteProductButton = new JButton("Delete Product");
        deleteProductButton.setBounds(70, 355, 175, 25);
        add(deleteProductButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(255, 355, 175, 25);
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

        deleteProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);

                PackageData pd = new PackageData("DELETE ITEM", Integer.parseInt(numberField.getText()));
                Main.connect(pd);

                numberField.setText(null);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.deleteMyAds.setVisible(false);
                Main.frame.userMenu.setVisible(true);
            }
        });
    }
}
