
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ray
 */
public class SellerHomePage {
    JFrame sellerHomeFrame = new JFrame();
    JButton yourAccount = new JButton("Your Account");
    JLabel welcomeUser = new JLabel();
    JLabel productListings = new JLabel("Your Listings");

    LinkedList<Product> productList = new LinkedList<>();
    SellerHomePage (User user, ShoppingSystem system){
        welcomeUser.setText("Welcome, " + user.getUsername());
        welcomeUser.setBounds(0,0,600,20);
        yourAccount.setBounds(400,0,400,20);
        productListings.setBounds(333,100,600,20);
        yourAccount.addActionListener((ActionEvent event) -> {
               system.setState(3);
               system.changeState();
               sellerHomeFrame.dispose();
       });
        sellerHomeFrame.add(productListings);
        sellerHomeFrame.add(welcomeUser);
        sellerHomeFrame.add(yourAccount);
        sellerHomeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        sellerHomeFrame.setSize(800,800);
        sellerHomeFrame.setLayout(null);
        sellerHomeFrame.setVisible(true);
    }
}