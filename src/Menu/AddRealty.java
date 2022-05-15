package Menu;

import DataB.PackageData;
import Main.Main;
import Class.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRealty extends Container {
    public AddRealty(){
        setSize(500, 500);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(75, 100, 125, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(225, 100, 200, 30);
        add(nameField);

        JLabel numberRoomsLabel = new JLabel("Number of rooms:");
        numberRoomsLabel.setBounds(75, 140, 125, 30);
        add(numberRoomsLabel);

        JTextField numberRoomsField = new JTextField();
        numberRoomsField.setBounds(225, 140, 200, 30);
        add(numberRoomsField);

        JLabel areaLabel = new JLabel("Total area:");
        areaLabel.setBounds(75, 180, 125, 30);
        add(areaLabel);

        JTextField areaField = new JTextField();
        areaField.setBounds(225, 180, 200, 30);
        add(areaField);

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
                Main.frame.addRealty.setVisible(false);
                Main.frame.addAd.setVisible(true);
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Realty newItem = new Realty(null, nameField.getText(),
                            Integer.parseInt(costField.getText()), Integer.parseInt(numberRoomsField.getText()),
                            Double.parseDouble(areaField.getText()));

                    PackageData packageData = new PackageData("ADD REALTY", newItem, Login.user);
                    Main.connect(packageData);

                    nameField.setText(null);
                    costField.setText(null);
                    areaField.setText(null);
                    numberRoomsField.setText(null);
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        });
    }
}
