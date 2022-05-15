package Menu;

import DataB.PackageData;
import Main.Main;
import Class.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends Container {
    public SignUp(){
        setSize(500, 500);
        setLayout(null);

        JLabel nameLabel = new JLabel("NAME:");
        nameLabel.setBounds(100, 70, 100, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 70, 200, 30);
        add(nameField);

        JLabel surnameLabel = new JLabel("SURNAME:");
        surnameLabel.setBounds(100, 110, 100, 30);
        add(surnameLabel);

        JTextField surnameField = new JTextField();
        surnameField.setBounds(200, 110, 200, 30);
        add(surnameField);

        JLabel emailLabel = new JLabel("EMAIL:");
        emailLabel.setBounds(100, 150, 100, 30);
        add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(200, 150, 200, 30);
        add(emailField);

        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setBounds(100, 190, 100, 30);
        add(passwordLabel);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(200, 190, 200, 30);
        add(passwordField);

        JButton singButton = new JButton("SIGN UP");
        singButton.setBounds(100, 230, 140, 40);
        add(singButton);

        JButton backButton = new JButton("BACK");
        backButton.setBounds(250, 230, 150, 40);
        add(backButton);

        singButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(!emailField.getText().equals( "" )  && !passwordField.getText().equals( "" ) &&
                            !nameField.getText().equals( "" ) && !surnameField.getText().equals( "" )){
                        User newUser = new User(null, emailField.getText(), passwordField.getText(), nameField.getText(), surnameField.getText());

                        PackageData pg = new PackageData("ADD USER", newUser);
                        Main.connect(pg);
                    }else{
                        JOptionPane.showMessageDialog(null, "You wrote something wrong!!!");
                    }
                }catch (Exception a){
                    a.printStackTrace();
                }
                nameField.setText(null);
                surnameField.setText(null);
                emailField.setText(null);
                passwordField.setText(null);
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.signUp.setVisible(false);
                Main.frame.mainMenu.setVisible(true);
            }
        });
    }
}
