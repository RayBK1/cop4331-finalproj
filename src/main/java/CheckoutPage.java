
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Iterator;
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
public class CheckoutPage {
    CheckoutPage(User user, ShoppingSystem system){
        Buyer buyer = (Buyer) user;
        JFrame viewFrame = new JFrame();
        JButton pay = new JButton("Checkout");
        JButton discount = new JButton("Add Discount");
        JLabel totalCost = new JLabel();
        JButton backButton = new JButton("Go back");
        int i = 100;
        double allCost = 0, totalDiscount = 0;
        for (ShoppingCartEntry s : buyer.getCart()) { 
            int quantity = s.getQuantity();
            Product prod = s.getProduct();
            double price = prod.getProductPrice();
            String string = s.String();
            JLabel product = new JLabel(string);
            double cost = 0;
            for (int k = 0; k < quantity; k++){
                cost += price;
            }
            JLabel totalCostOfProduct = new JLabel(String.valueOf(cost));
            allCost += cost;
            totalCostOfProduct.setBounds(600,i,100,50);
            product.setBounds(100,i,400,50);
            viewFrame.add(product);
            i += 100;
            totalDiscount = s.getDiscount();
        }
        discount.addActionListener( (ActionEvent event) ->{
             system.setState(7);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(CheckoutPage.class.getName()).log(Level.SEVERE, null, ex);
            }
             viewFrame.dispose();
        });
        pay.addActionListener( (ActionEvent event) ->{
            for (ShoppingCartEntry s : buyer.getCart()){
                Product prod = s.getProduct();
                int quantity = s.getQuantity();
                prod.subtractProductQuantity(quantity);
                for (int k = 0; k < quantity; k++){
                    prod.updateTotalCosts();
                    prod.updateTotalSales();
                }
                prod.updateTotalProfit();
            }
            buyer.clearCart();
            system.setState(2);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(CheckoutPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            viewFrame.dispose();
        });
        backButton.addActionListener( (ActionEvent event) -> {
            system.setState(1);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(CheckoutPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            viewFrame.dispose();
        });
        backButton.setBounds(600,0,200,50);
        pay.setBounds(400,740,400,20);
        discount.setBounds(0,740,400,20);
        if (totalDiscount != 0){
            allCost = allCost * (1-(totalDiscount/100));
        }
        totalCost.setText("Total Cost: " + String.valueOf(allCost));
        totalCost.setBounds(300,660,400,20);
        viewFrame.add(backButton);
        viewFrame.add(pay);
        viewFrame.add(discount);
        viewFrame.add(totalCost);
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(800,800);
        viewFrame.setLayout(null);
        viewFrame.setVisible(true);
        
    }
}