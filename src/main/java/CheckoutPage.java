
import java.awt.event.ActionEvent;
import java.util.Iterator;
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
        JButton pay = new JButton("Pay");
        JButton discount = new JButton("Add Discount");
        JLabel totalCost = new JLabel();
        int i = 100;
        for (ShoppingCartEntry s : buyer.getCart()) { 
            String string = s.toString();
            JLabel product = new JLabel(string);
            product.setBounds(100,i,400,50);
            viewFrame.add(product);
            i += 100;
        }
        discount.addActionListener( (ActionEvent event) ->{
             
        });
        
        pay.setBounds(400,740,400,20);
        discount.setBounds(0,740,400,20);
        
        viewFrame.add(pay);
        viewFrame.add(discount);
        viewFrame.add(totalCost);
        viewFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        viewFrame.setSize(800,800);
        viewFrame.setLayout(null);
        viewFrame.setVisible(true);
        
    }
}