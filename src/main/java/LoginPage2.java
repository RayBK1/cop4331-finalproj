
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author garre
 */
public class LoginPage2 {
    JLabel usernameJLabel = new JLabel("username");
    JLabel passwordJLabel = new JLabel("password");
    public LoginPage2(UserList<User> userList, ShoppingSystem system)
    {
        JFrame loginFrame = new JFrame();
        JButton loginJButton = new JButton("Log in");
        
        usernameJLabel.setBounds(40,100,75,25);
        passwordJLabel.setBounds(40,150,75,25);
        
        JTextField usernameJField = new JTextField();
        JPasswordField passwordJField = new JPasswordField();
        
        loginJButton.addActionListener((ActionEvent event) -> {
            String username = usernameJField.getText();
            String password = passwordJField.getText();
            User u = userList.queryUsers(username, password);
            if (u != null)
            {
                system.setUser(u);
                system.setState(1);
                try {
                    system.changeState();
                } catch (IOException ex) {
                    Logger.getLogger(LoginPage2.class.getName()).log(Level.SEVERE, null, ex);
                }
                loginFrame.dispose();
            }
            else
            {
                
            }
        });
        usernameJField.setBounds(130,100,200,25);   
        passwordJField.setBounds(130,150,200,25);
        loginJButton.setBounds(130,200,100,25);
        
        loginFrame.add(usernameJLabel);
        loginFrame.add(passwordJLabel);
        loginFrame.add(loginJButton);
        loginFrame.add(usernameJField);
        loginFrame.add(passwordJField);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(400,400);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
    }
}
