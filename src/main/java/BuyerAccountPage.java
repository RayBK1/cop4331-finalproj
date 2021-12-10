
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raymon
 */
public class BuyerAccountPage {
    BuyerAccountPage(User user, ShoppingSystem system){
        JFrame buyerAccountFrame = new JFrame();
        JLabel usernameLabel = new JLabel("Your Username:");
        JLabel passwordLabel = new JLabel("Your Password:");
        JLabel yourUsername = new JLabel();
        JLabel yourPassword = new JLabel();
        JLabel accountPurposeLabel = new JLabel("Account Type:");
        JLabel yourAccountPurpose = new JLabel();
        JLabel accountIDLabel = new JLabel("Your Account ID:");
        JLabel yourAccountID = new JLabel();
        JButton back = new JButton("Back");
        yourUsername.setText(user.getUsername());
        yourPassword.setText(user.getPassword());
        yourAccountPurpose.setText(user.getAccountPurpose());
        yourAccountID.setText(String.valueOf(user.getUserID()));
        
        back.addActionListener((ActionEvent event) -> {
                system.setState(1);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(BuyerAccountPage.class.getName()).log(Level.SEVERE, null, ex);
            }
                buyerAccountFrame.dispose();
        });

        usernameLabel.setBounds(100,150,200,50);
        yourUsername.setBounds(400,150,200,50);
        passwordLabel.setBounds(100,300,200,50);
        yourPassword.setBounds(400,300,200,50);
        accountPurposeLabel.setBounds(100,450,200,50);
        yourAccountPurpose.setBounds(400,450,200,50);
        accountIDLabel.setBounds(100,600,200,50);
        yourAccountID.setBounds(400,600,200,50);
        back.setBounds(200,700,200,50);
        
        
        buyerAccountFrame.add(usernameLabel);
        buyerAccountFrame.add(passwordLabel);
        buyerAccountFrame.add(yourUsername);
        buyerAccountFrame.add(yourPassword);
        buyerAccountFrame.add(accountPurposeLabel);
        buyerAccountFrame.add(yourAccountPurpose);
        buyerAccountFrame.add(accountIDLabel);
        buyerAccountFrame.add(yourAccountID);
        buyerAccountFrame.add(back);
        buyerAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buyerAccountFrame.setSize(800,800);
        buyerAccountFrame.setLayout(null);
        buyerAccountFrame.setVisible(true);
    }

}