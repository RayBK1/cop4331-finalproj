
import java.awt.event.ActionEvent;
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
 * @author Raymon
 */
public class TransactionCompletePopUp {
    JFrame frame = new JFrame();
    TransactionCompletePopUp(User user, ShoppingSystem system){
        
        JLabel success = new JLabel("Your purchase has been completed!");
        JButton logoutButton = new JButton("Logout");
        JButton toproductsButton = new JButton("Back to shopping");
        
        success.setBounds(100,100,400,50);
        logoutButton.setBounds(0,420,250,50);
        toproductsButton.setBounds(250,420,250,50);
        
        logoutButton.addActionListener((ActionEvent event) -> {
            system.setState(0);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(TransactionCompletePopUp.class.getName()).log(Level.SEVERE, null, ex);
            }
            frame.dispose();
        });
        
        toproductsButton.addActionListener( (ActionEvent event) -> {
            system.setState(1);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(TransactionCompletePopUp.class.getName()).log(Level.SEVERE, null, ex);
            }
            frame.dispose(); 
        });
        
        frame.add(logoutButton);
        frame.add(success);
        frame.add(toproductsButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
