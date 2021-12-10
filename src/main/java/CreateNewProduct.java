

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.lang.Double.parseDouble;
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
public class CreateNewProduct {
    CreateNewProduct(User user, ShoppingSystem system){
        Seller seller = (Seller) user;
        
        JFrame popUpFrame = new JFrame();
        JLabel productNameLabel = new JLabel("Enter Product Name:");
        JLabel productCategoryLabel = new JLabel("Enter Product Category:");
        JLabel productInvoicePriceLabel = new JLabel("Enter Product Invoice Price:");
        JLabel productSellPriceLabel = new JLabel("Enter Product Sell Price:");
        JLabel productQuantityLabel = new JLabel("Enter Product Quantity:");
        JButton createButton = new JButton("Create Product");
        JButton backButton = new JButton("Go back");
        
        JTextField nameField = new JTextField();
        JTextField categoryField = new JTextField();
        JTextField invoiceField = new JTextField();
        JTextField sellField = new JTextField();
        JTextField quantityField = new JTextField();
        
        productNameLabel.setBounds(200, 100, 200, 50);
        productCategoryLabel.setBounds(200,200,200,50);
        productQuantityLabel.setBounds(200,300,200,50);
        productInvoicePriceLabel.setBounds(200,400,200,50);
        productSellPriceLabel.setBounds(200,500,200,50);
        backButton.setBounds(100,600,200,50);
        
        nameField.setBounds(400, 100, 100, 50);
        categoryField.setBounds(400, 200, 100, 50);
        quantityField.setBounds(400,300,100,50);
        invoiceField.setBounds(400,400,100,50);
        sellField.setBounds(400,500,100,50);
        
        createButton.setBounds(300,600,200,50);
        createButton.addActionListener((ActionEvent event) -> {
            String name = nameField.getText();
            String category = categoryField.getText();
            Double invoice = parseDouble(invoiceField.getText());
            Double sellPrice = parseDouble(sellField.getText());
            int quantity = Integer.parseInt(quantityField.getText());
            Product product = new Product(name,"filler",sellPrice, quantity, category, 0, 0, invoice, 0, 0);
            seller.addToListedProducts(product);
            system.getProductList().add(product);
            system.setState(1);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(CreateNewProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
            popUpFrame.dispose();
            
        });
        
        backButton.addActionListener( (ActionEvent event) ->{
            system.setState(1);
            try {
                system.changeState();
            } catch (IOException ex) {
                Logger.getLogger(CreateNewProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
            popUpFrame.dispose();
        });
        popUpFrame.add(productNameLabel);
        popUpFrame.add(productCategoryLabel);
        popUpFrame.add(productQuantityLabel);
        popUpFrame.add(productInvoicePriceLabel);
        popUpFrame.add(productSellPriceLabel);
        
        popUpFrame.add(nameField);
        popUpFrame.add(categoryField);
        popUpFrame.add(invoiceField);
        popUpFrame.add(sellField);
        popUpFrame.add(quantityField);
        
        popUpFrame.add(createButton);
        popUpFrame.add(backButton);
        popUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        popUpFrame.setSize(600,800);
        popUpFrame.setLayout(null);
        popUpFrame.setVisible(true);
    }
}
