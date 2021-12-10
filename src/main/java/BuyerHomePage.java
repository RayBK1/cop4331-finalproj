
import java.awt.event.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    JButton checkout = new JButton("Your Cart");
    JLabel compare = new JLabel("Sort products by:");
    JLabel welcomeUser = new JLabel();
    JLabel productListings = new JLabel("Available Products");
    JButton logOutButton = new JButton("Log out");
    ProductList<Product> productList = new ProductList<>();
    int i = 200;
    BuyerHomePage(Buyer user, ShoppingSystem system){
        for (Product p: system.getProductList()){
            productList.add(p);
        }
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
        logOutButton.setBounds(0,740,400,20);
        checkout.setBounds(400,740,400,20);
        productListings.setBounds(100,50,600,20);
        compare.setBounds(100,125,200,20);
        
        JButton furniture = new JButton("furniture");
        furniture.setBounds(250,125,150,50);
        furniture.addActionListener( (ActionEvent event) ->{
            int k = 100;
            for (Product p : productList.limitByProductCategory("furniture")){
                JLabel label = new JLabel();
                label.setBounds(k, 650, 200, 50);
                String s = p.getProductName();
                label.setText(s);
                buyerHomeFrame.add(label);
                k += 200;
            }
        });
        buyerHomeFrame.add(furniture);
        JButton christmas = new JButton("christmas");
        christmas.setBounds(400,125,150,50);
        christmas.addActionListener((ActionEvent event) ->{
            int k = 100;
            for (Product p : productList.limitByProductCategory("christmas")){
                JLabel label = new JLabel();
                label.setBounds(k, 650, 200, 50);
                String s = p.getProductName();
                label.setText(s);
                buyerHomeFrame.add(label);
                k += 200;
            }
        });
        buyerHomeFrame.add(christmas);
        JButton lowPrice = new JButton("below 10 dollars");
        lowPrice.setBounds(550,125,150,50);
        lowPrice.addActionListener((ActionEvent event) ->{
            int k = 100;
            for (Product p : productList.limitByProductPrice(0,10)){
                JLabel label = new JLabel();
                label.setBounds(k, 650, 200, 50);
                String s = p.getProductName();
                label.setText(s);
                buyerHomeFrame.add(label);
                k += 200;
            }
        });
        buyerHomeFrame.add(lowPrice);
        yourAccount.addActionListener((ActionEvent event) -> {
                system.setState(3);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(BuyerHomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
                buyerHomeFrame.dispose();
        });
        checkout.addActionListener((ActionEvent event) -> {
                system.setState(4);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(BuyerHomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
                buyerHomeFrame.dispose();
        });
        logOutButton.addActionListener((ActionEvent event) ->{
                system.setState(0);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(BuyerHomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
                buyerHomeFrame.dispose();
        });
        buyerHomeFrame.add(compare);
        buyerHomeFrame.add(logOutButton);
        buyerHomeFrame.add(productListings);
        buyerHomeFrame.add(welcomeUser);
        buyerHomeFrame.add(yourAccount);
        buyerHomeFrame.add(checkout);
        buyerHomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buyerHomeFrame.setSize(800,800);
        buyerHomeFrame.setLayout(null);
        buyerHomeFrame.setVisible(true);
    }
}