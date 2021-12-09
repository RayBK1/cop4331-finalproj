
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
public class ViewMoreInfoPopUp {
    ViewMoreInfoPopUp(Product p){
        JFrame popUpFrame = new JFrame();
        JLabel productNameLabel = new JLabel("Product Name: " + p.getProductName());
        JLabel productCategoryLabel = new JLabel("Product Category: " + p.getProductCategory());
        JLabel productQuantityLabel = new JLabel("Quantity Left: " + p.getProductQuantity());
        JButton addToCartButton = new JButton("Add item to cart");
        
        productNameLabel.setBounds(200, 150, 200, 50);
        productCategoryLabel.setBounds(200,300,200,50);
        productQuantityLabel.setBounds(200,450,200,50);
        addToCartButton.setBounds(200,550,200,50);
    
        addToCartButton.addActionListener( (ActionEvent event) -> {
            
        });
        
        popUpFrame.add(productNameLabel);
        popUpFrame.add(productCategoryLabel);
        popUpFrame.add(productQuantityLabel);
        
        popUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        popUpFrame.setSize(600,600);
        popUpFrame.setLayout(null);
        popUpFrame.setVisible(true);
    }
}
