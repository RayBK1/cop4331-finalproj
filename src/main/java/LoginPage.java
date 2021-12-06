
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ray
 */
public class LoginPage implements ActionListener {
    
    JFrame loginFrame = new JFrame();
    
    JButton loginJButton = new JButton("Log in");
    
    JTextField usernameJField = new JTextField();
    JPasswordField passwordJField = new JPasswordField();
    
    JLabel usernameJLabel = new JLabel("username");
    JLabel passwordJLabel = new JLabel("password");
    JLabel popupText = new JLabel();
    
    LinkedList<User> users = new LinkedList<>();
    
    LoginPage(LinkedList<User> userList){
    
    users = userList;
    
    usernameJField.setBounds(130,100,200,25);   
    passwordJField.setBounds(130,150,200,25);
    popupText.setBounds(130,250,250,35);
    
    usernameJLabel.setBounds(40,100,75,25);
    passwordJLabel.setBounds(40,150,75,25);
    loginJButton.setBounds(130,200,100,25);
    
    loginJButton.addActionListener(this);
    loginFrame.add(popupText);
    loginFrame.add(loginJButton);
    loginFrame.add(usernameJField);
    loginFrame.add(passwordJField);
    loginFrame.add(usernameJLabel);
    loginFrame.add(passwordJLabel);
    loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    loginFrame.setSize(400,400);
    loginFrame.setLayout(null);
    loginFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginJButton){
            String username = usernameJField.getText();
            String password = passwordJField.getText();
            Iterator<User> it = users.iterator();
            while(it.hasNext())
            {
                User current = it.next();
                if (current.getUsername().equals(username) && current.getPassword().equals(password)){
                    popupText.setText("login successful");
                    loginFrame.dispose();
                    if (current.getAccountPurpose().equals("seller")){
                        SellerHomePage sellerPage = new SellerHomePage(current);
                    }
                    else{
                        BuyerHomePage buyerPage = new BuyerHomePage(current);
                    }
                }
                else 
                {
                popupText.setText("incorrect login");
                }
            }
        }
    }
}
