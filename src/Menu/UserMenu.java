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

        JButton purchasedGoodsButton = new JButton("Delete my product");
        purchasedGoodsButton.setBounds(100, 220, 300, 40);
        add(purchasedGoodsButton);

        JButton backButton = new JButton("Back to menu");
        backButton.setBounds(100, 270, 300, 40);
        add(backButton);

        catalogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.catalogMenu.setVisible(true);
            }
        });

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.findMenu.setVisible(true);
            }
        });

        discountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.discountMenu.setVisible(true);
            }
        });

        purchasedGoodsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.userMenu.setVisible(false);
                Frame.purchasedGoods.setVisible(true);
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
