
import java.awt.event.*;
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
public class BuyerHomePage {
    
    JFrame buyerHomeFrame = new JFrame();
    JButton yourAccount = new JButton("Your Account");
    JButton checkout = new JButton("Checkout");
    JLabel welcomeUser = new JLabel();
    JLabel productListings = new JLabel("Available Products");
    LinkedList<Product> productList = new LinkedList<>();
    int i = 200;
    BuyerHomePage(User user, ShoppingSystem system){
        for (Product p: system.getProductList()){
            JLabel productLabel = new JLabel();
            productLabel.setText(p.getProductName());
            JButton viewMoreInfoButton = new JButton();
            JButton addToCartButton = new JButton();
            viewMoreInfoButton.setText("View more info");
            addToCartButton.setText("Add to cart");
            productLabel.setBounds(150,i,200,50);
            viewMoreInfoButton.setBounds(350,i,200,50);
            addToCartButton.setBounds(550,i,200,50);
            viewMoreInfoButton.addActionListener( (ActionEvent event) ->{
               ViewMoreInfoPopUp popup = new ViewMoreInfoPopUp(p); 
            });
            addToCartButton.addActionListener( (ActionEvent event) -> {
                AddToCartPopUp popup = new AddToCartPopUp(user, p);
            });
            buyerHomeFrame.add(productLabel);
            buyerHomeFrame.add(viewMoreInfoButton);
            buyerHomeFrame.add(addToCartButton);
            i += 100;
        }
        welcomeUser.setText("Welcome, " + user.getUsername());
        welcomeUser.setBounds(0,0,600,20);
        yourAccount.setBounds(400,0,400,20);
        checkout.setBounds(400,740,400,20);
        productListings.setBounds(333,100,600,20);
        yourAccount.addActionListener((ActionEvent event) -> {
                system.setState(3);
                system.changeState();
                buyerHomeFrame.dispose();
        });
        checkout.addActionListener((ActionEvent event) -> {
                system.setState(2);
                system.changeState();
                buyerHomeFrame.dispose();
        });
        buyerHomeFrame.add(productListings);
        buyerHomeFrame.add(welcomeUser);
        buyerHomeFrame.add(yourAccount);
        buyerHomeFrame.add(checkout);
        buyerHomeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        buyerHomeFrame.setSize(800,800);
        buyerHomeFrame.setLayout(null);
        buyerHomeFrame.setVisible(true);
    }
}