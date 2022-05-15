package Menu;
import Main.Frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    public MainMenu(){
        setSize(500, 500);
        setLayout(null);

        JLabel label = new JLabel("OLX");
        label.setFont(new Font("Tahoma", Font.PLAIN, 18));
        label.setBounds(80, 100, 360, 40);
        add(label);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(100, 150, 300, 40);
        add(loginButton);

        JButton singButton = new JButton("SIGN UP");
        singButton.setBounds(100, 200, 300, 40);
        add(singButton);

        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(100, 250, 300, 40);
        add(exitButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.login.setVisible(true);
                Frame.mainMenu.setVisible(false);
            }
        });

        singButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.signUp.setVisible(true);
                Frame.mainMenu.setVisible(false);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
