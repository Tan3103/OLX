package Menu;

import DataB.PackageData;
import Main.Main;
import Class.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddAnimal extends Container {
    public AddAnimal(){
        setSize(500, 500);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(75, 100, 125, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(225, 100, 200, 30);
        add(nameField);

        JLabel breedLabel = new JLabel("Breed:");
        breedLabel.setBounds(75, 140, 125, 30);
        add(breedLabel);

        JTextField breedRoomsField = new JTextField();
        breedRoomsField.setBounds(225, 140, 200, 30);
        add(breedRoomsField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(75, 180, 125, 30);
        add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(225, 180, 200, 30);
        add(ageField);

        JLabel costLabel = new JLabel("Price:");
        costLabel.setBounds(75, 220, 125, 30);
        add(costLabel);

        JTextField costField = new JTextField();
        costField.setBounds(225, 220, 200, 30);
        add(costField);

        JButton addButton = new JButton("Add");
        addButton.setBounds(75, 260, 170, 30);
        add(addButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(255, 260, 170, 30);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addAnimal.setVisible(false);
                Main.frame.addAd.setVisible(true);
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Animal newItem = new Animal(null, nameField.getText(),
                        Integer.parseInt(costField.getText()), breedRoomsField.getText(),
                        Integer.parseInt(ageField.getText()));

                PackageData packageData = new PackageData("ADD ANIMAL", newItem, Login.user);
                Main.connect(packageData);

                nameField.setText(null);
                costField.setText(null);
                ageField.setText(null);
                breedRoomsField.setText(null);
            }
        });
    }
}
