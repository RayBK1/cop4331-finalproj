
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
public class discountPopUp {
    discountPopUp(User user, ShoppingSystem system){
        Buyer buyer = (Buyer) user;
        JFrame discountFrame = new JFrame();
        JLabel discountLabel = new JLabel("Enter discount (don't type the percent sign):");
        JButton cancelButton = new JButton("Cancel");
        JButton discountButton = new JButton("Add Discount");
        JTextField discountField = new JTextField();
        
        discountFrame.add(discountLabel);
        
        discountFrame.add(cancelButton);
        cancelButton.addActionListener((ActionEvent event) -> {
            system.setState(4);
            system.changeState();
            discountFrame.dispose();
        });
        
        discountFrame.add(discountButton);
        discountButton.addActionListener((ActionEvent event) -> {
           double discount = parseDouble(discountField.getText());
           for (ShoppingCartEntry s : buyer.getCart()){
               s.setDiscount(discount);
            }
           system.setState(4);
           system.changeState();
           discountFrame.dispose();
        });
        discountLabel.setBounds(100,200,300,50);
        discountField.setBounds(400,200,50,50);
        cancelButton.setBounds(0,500,300,50);
        discountButton.setBounds(300,500,300,50);
        discountFrame.add(discountField);
        discountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        discountFrame.setSize(600,600);
        discountFrame.setLayout(null);
        discountFrame.setVisible(true);
    }
}