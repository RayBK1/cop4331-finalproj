
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
        JLabel productPriceLabel = new JLabel("Product Price: " + p.getProductPrice());
        JLabel productQuantityLabel = new JLabel("Quantity Left: " + p.getProductQuantity());
        
        productNameLabel.setBounds(200, 100, 200, 50);
        productCategoryLabel.setBounds(200,200,200,50);
        productQuantityLabel.setBounds(200,300,200,50);
        productPriceLabel.setBounds(200,400,200,50);
      
        popUpFrame.add(productNameLabel);
        popUpFrame.add(productCategoryLabel);
        popUpFrame.add(productQuantityLabel);
        popUpFrame.add(productPriceLabel);
        
        popUpFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        popUpFrame.setSize(600,600);
        popUpFrame.setLayout(null);
        popUpFrame.setVisible(true);
    }
}
