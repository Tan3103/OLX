package Menu;

import DataB.PackageData;
import Main.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainHeadings extends Container {
    public static JTextArea textArea;
    public MainHeadings(){
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

        JLabel label = new JLabel("Enter the number of the item you want to buy");
        label.setBounds(70, 320, 270, 25);
        add(label);

        JTextField numberField = new JTextField();
        numberField.setBounds(350, 320, 80, 25);
        add(numberField);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(255, 360, 175, 30);
        add(backButton);

        JButton buyProductButton = new JButton("Buy a product");
        buyProductButton.setBounds(70, 360, 175, 30);
        add(buyProductButton);

        realtyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);

                PackageData pd = new PackageData("LIST REALTY");
                Main.connect(pd);
            }
        });

        CSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);

                PackageData pd = new PackageData("LIST CS");
                Main.connect(pd);
            }
        });

        AnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(null);

                PackageData pd = new PackageData("LIST ANIMAL");
                Main.connect(pd);
            }
        });

        buyProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                }
                catch (Exception a){
                    a.printStackTrace();
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.mainHeadings.setVisible(false);
                Main.frame.userMenu.setVisible(true);
            }
        });
    }
}
