
import java.awt.event.ActionEvent;
import static java.lang.Double.parseDouble;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raymon
 */
public class UpdateProductPopUp {
    UpdateProductPopUp(Product p){
        JFrame popUpFrame = new JFrame();
        JLabel productQuantityLabel = new JLabel("Update Product Quantity:");
        JLabel productInvoicePriceLabel = new JLabel("Update Product Invoice Price:");
        JLabel productSellingPriceLabel = new JLabel("Update Product Sell Price:");
        JButton updateButton = new JButton("Update");
        JButton cancelButton = new JButton("Cancel/Go Back");
        JTextField productQuantityUpdateButton = new JTextField();
        JTextField productInvoicePriceUpdateButton = new JTextField();
        JTextField productSellingPriceUpdateButton = new JTextField();
        
        updateButton.setBounds(125,500,150,50);
        productQuantityLabel.setBounds(200, 100, 200, 50);
        productQuantityUpdateButton.setBounds(400, 100, 100, 50);
        productInvoicePriceLabel.setBounds(200,200,200,50);
        productInvoicePriceUpdateButton.setBounds(400,200,100,50);
        productSellingPriceLabel.setBounds(200,300,200,50);
        productSellingPriceUpdateButton.setBounds(400,300,100,50);
        cancelButton.setBounds(325,500,150,50);
      
        updateButton.addActionListener( (ActionEvent event) -> {
           if(!productQuantityUpdateButton.getText().equals("")) {
               p.updateProductQuantity(Integer.parseInt(productQuantityUpdateButton.getText()));
            } 
           if (!productInvoicePriceUpdateButton.getText().equals("")){
               p.updateProductInvoicePrice(parseDouble(productInvoicePriceUpdateButton.getText()));
           }
           if (!productSellingPriceUpdateButton.getText().equals("")){
               p.updateProductSellPrice(parseDouble(productSellingPriceUpdateButton.getText()));
           }
        });
        cancelButton.addActionListener( (ActionEvent event) -> {
        popUpFrame.dispose();
        });
        
        popUpFrame.add(productQuantityUpdateButton);
        popUpFrame.add(productInvoicePriceUpdateButton);
        popUpFrame.add(productSellingPriceUpdateButton);
        popUpFrame.add(productQuantityLabel);
        popUpFrame.add(productInvoicePriceLabel);
        popUpFrame.add(productSellingPriceLabel);
        popUpFrame.add(cancelButton);
        popUpFrame.add(updateButton);
        
        popUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        popUpFrame.setSize(600,600);
        popUpFrame.setLayout(null);
        popUpFrame.setVisible(true);  
    }
}
