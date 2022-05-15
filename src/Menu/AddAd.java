package Menu;
import Main.Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddAd extends Container {
    public AddAd(){
        setSize(500, 500);
        setLayout(null);

        JButton addRealtyButton = new JButton("Add Realty");
        addRealtyButton.setBounds(355, 50, 75, 25);
        add(addRealtyButton);

        JButton addCSButton = new JButton("Add clothing/shoes");
        addCSButton.setBounds(355, 80, 75, 25);
        add(addCSButton);

        JButton addAnimalButton = new JButton("Add animal");
        addAnimalButton.setBounds(355, 110, 75, 25);
        add(addAnimalButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(70, 360, 360, 30);
        add(backButton);

        addRealtyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addAd.setVisible(false);
                Main.frame.addRealty.setVisible(true);
            }
        });

        addCSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addAd.setVisible(false);
                Main.frame.addCS.setVisible(true);
            }
        });

        addAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addAd.setVisible(false);
                Main.frame.addAnimal.setVisible(true);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addAd.setVisible(false);
                Main.frame.userMenu.setVisible(true);
            }
        });
    }
}
