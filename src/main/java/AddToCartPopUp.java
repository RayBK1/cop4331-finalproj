
import java.awt.event.ActionEvent;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raymon
 */
public class AddToCartPopUp {
    AddToCartPopUp(Buyer user, Product p){
        
        JFrame popUpFrame = new JFrame();
        
        JLabel addTextLabel = new JLabel("How many of this product do you want?");
        JTextField inputQuantityField = new JTextField();
        JButton addButton = new JButton("Add To Cart");
        JButton cancelButton = new JButton("Cancel");
        JLabel popUpText = new JLabel();
        
        addTextLabel.setBounds(75,200,300,50);
        popUpText.setBounds(75,400,500,100);
        inputQuantityField.setBounds(475,200,75,50);
        addButton.setBounds(125,500,150,50);
        cancelButton.setBounds(325,500,150,50);
        
        addButton.addActionListener( (ActionEvent event) -> {
            int quantity = Integer.parseInt(inputQuantityField.getText());
            if (quantity > p.getProductQuantity()){
                popUpText.setText("""
                                  Quantity entered exceeds quantity of product! Try again.
                                     Quantity left:""" + p.getProductQuantity());
                
            }
            else {
                ShoppingCart<ShoppingCartEntry> cart = user.getCart();
                cart.addItem(p, quantity);
                popUpFrame.dispose();
                }
        });
        cancelButton.addActionListener( (ActionEvent event) -> {
            popUpFrame.dispose();
        });
        
        popUpFrame.add(popUpText);
        popUpFrame.add(addTextLabel);
        popUpFrame.add(inputQuantityField);
        popUpFrame.add(addButton);
        popUpFrame.add(cancelButton);
        
        popUpFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        popUpFrame.setSize(600,600);
        popUpFrame.setLayout(null);
        popUpFrame.setVisible(true);
    }
}
