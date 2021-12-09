
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
public class BuyerHomePage implements ActionListener {
    
    JFrame buyerHomeFrame = new JFrame();
    JButton yourAccount = new JButton("Your Account");
    JButton checkout = new JButton("Checkout");
    JLabel welcomeUser = new JLabel();
    JLabel productListings = new JLabel("Available Products");
    LinkedList<Product> productList = new LinkedList<>();
    private final User buyer;
    BuyerHomePage(User user){
        buyer = user;
        welcomeUser.setText("Welcome, " + user.getUsername());
        welcomeUser.setBounds(0,0,200,20);
        yourAccount.setBounds(200,0,200,20);
        checkout.setBounds(200,340,200,20);
        productListings.setBounds(133,50,200,20);
        yourAccount.addActionListener(this);
        checkout.addActionListener(this);
        //Iterator<Product> it = productList.iterator();
        // while(it.hasNext()){
            //JTextField productText = new JTextField();
            //trying to populate products in the text field
            //don't know how to get the list of products to use iterator pattern here
        //}
        buyerHomeFrame.add(productListings);
        buyerHomeFrame.add(welcomeUser);
        buyerHomeFrame.add(yourAccount);
        buyerHomeFrame.add(checkout);
        buyerHomeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        buyerHomeFrame.setSize(400,400);
        buyerHomeFrame.setLayout(null);
        buyerHomeFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
     if (e.getSource() == yourAccount){
         BuyerAccountPage buyerAccount = new BuyerAccountPage(buyer);
         buyerHomeFrame.dispose();
     }   
     if (e.getSource() == checkout){
         CheckoutPage buyerCheckout = new CheckoutPage(buyer);
         buyerHomeFrame.dispose();
     }
    }
}