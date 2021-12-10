
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
    JButton addProductButton = new JButton("Add a product");
    JButton viewSellDataButton = new JButton("View Sell Data");
    JButton logOutButton = new JButton("Log out");
    int i = 200;
    LinkedList<Product> productList = new LinkedList<>();
    SellerHomePage (User user, ShoppingSystem system){
        Seller seller = (Seller) user;
        seller.getListedProducts().stream().map(p -> {
            JLabel productLabel = new JLabel();
            productLabel.setText(p.getProductName());
            JButton viewMoreInfoButton = new JButton();
            JButton updateButton = new JButton();
            viewMoreInfoButton.setText("View more info");
            updateButton.setText("Update product");
            productLabel.setBounds(150,i,200,50);
            viewMoreInfoButton.setBounds(350,i,200,50);
            updateButton.setBounds(550,i,200,50);
            viewMoreInfoButton.addActionListener( (ActionEvent event) ->{
                ViewMoreInfoPopUp popup = new ViewMoreInfoPopUp(p);
            });
            updateButton.addActionListener( (ActionEvent event) -> {
                UpdateProductPopUp popup = new UpdateProductPopUp(p);
            });
            sellerHomeFrame.add(productLabel);
            sellerHomeFrame.add(viewMoreInfoButton);
            sellerHomeFrame.add(updateButton);
            return p;
        }).forEachOrdered(_item -> {
            i += 100;
        });
        
            welcomeUser.setText("Welcome, " + user.getUsername());
            welcomeUser.setBounds(0,0,600,20);
            yourAccount.setBounds(400,0,400,20);
            productListings.setBounds(333,100,600,20);
            addProductButton.setBounds(250,740,250,20);
            viewSellDataButton.setBounds(0,740,250,20);
            logOutButton.setBounds(500,740,300,20);
            logOutButton.addActionListener((ActionEvent event) ->{
                    system.setState(0);
                    system.changeState();
                    sellerHomeFrame.dispose();
            });
            sellerHomeFrame.add(logOutButton);
            
            addProductButton.addActionListener((ActionEvent event) ->{
                system.setState(6);
                system.changeState();
                sellerHomeFrame.dispose();
            });
            
            viewSellDataButton.addActionListener((ActionEvent event) ->{
                system.setState(5);
                system.changeState();
                sellerHomeFrame.dispose();
            });
            
            yourAccount.addActionListener((ActionEvent event) -> {
                   system.setState(3);
                   system.changeState();
                   sellerHomeFrame.dispose();
           });
            sellerHomeFrame.add(viewSellDataButton);
            sellerHomeFrame.add(addProductButton);
            sellerHomeFrame.add(productListings);
            sellerHomeFrame.add(welcomeUser);
            sellerHomeFrame.add(yourAccount);
            sellerHomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            sellerHomeFrame.setSize(800,800);
            sellerHomeFrame.setLayout(null);
            sellerHomeFrame.setVisible(true);
        }
}