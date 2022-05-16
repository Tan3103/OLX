package Menu;
import Main.Frame;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    public MainMenu(){
        setSize(500, 500);
        setLayout(null);

        Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        JLabel label = new JLabel("  OLX");
        label.setBorder(solidBorder);
        label.setFont(new Font("Courier New", Font.PLAIN, 20));
        label.setBounds(205, 100, 90, 40);
        add(label);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(100, 150, 140, 40);
        add(loginButton);

        JButton singButton = new JButton("SIGN UP");
        singButton.setBounds(260, 150, 140, 40);
        add(singButton);

        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(100, 200, 300, 40);
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
