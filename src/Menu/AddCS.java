package Menu;

import DataB.PackageData;
import Main.Main;
import Class.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCS extends Container {
    public AddCS(){
        setSize(500, 500);
        setLayout(null);

        Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        JLabel label = new JLabel(" CLOTHING/SHOES");
        label.setBorder(solidBorder);
        label.setFont(new Font("Courier New", Font.PLAIN, 20));
        label.setBounds(150, 50, 200, 40);
        add(label);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(75, 100, 125, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(225, 100, 200, 30);
        add(nameField);

        JLabel sizeLabel = new JLabel("Size:");
        sizeLabel.setBounds(75, 140, 125, 30);
        add(sizeLabel);

        JTextField sizeField = new JTextField();
        sizeField.setBounds(225, 140, 200, 30);
        add(sizeField);

        JLabel costLabel = new JLabel("Price:");
        costLabel.setBounds(75, 180, 125, 30);
        add(costLabel);

        JTextField costField = new JTextField();
        costField.setBounds(225, 180, 200, 30);
        add(costField);

        JButton addButton = new JButton("Add");
        addButton.setBounds(75, 220, 170, 30);
        add(addButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(255, 220, 170, 30);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addCS.setVisible(false);
                Main.frame.addAd.setVisible(true);
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ClothingShoes newItem = new ClothingShoes(null, nameField.getText(),
                            Integer.parseInt(costField.getText()), sizeField.getText());

                    PackageData packageData = new PackageData("ADD CS", newItem, Login.user);
                    Main.connect(packageData);

                    nameField.setText(null);
                    costField.setText(null);
                    sizeField.setText(null);
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        });
    }
}
