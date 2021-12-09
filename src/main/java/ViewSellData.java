import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raymon
 */
public class ViewSellData {
    JFrame viewFrame = new JFrame();
    int i = 100;
    double profit;
    double cost, sell;
    ViewSellData(User user, ShoppingSystem system){
        Seller seller = (Seller) user;
        
        JLabel profitLabel = new JLabel();
        JLabel costLabel = new JLabel();
        JLabel sellLabel = new JLabel();
        JButton backButton = new JButton("Go back");
        
        sellLabel.setBounds(100,300,300,50);
        costLabel.setBounds(100,450,300,50);
        profitLabel.setBounds(100,600,300,50);
        backButton.setBounds(300,650,200,50);
        
        ArrayList<String> options = new ArrayList<>();
        
        options.add("Total");
        seller.getListedProducts().forEach(p -> {
            options.add(p.getProductName());
        });
        
        for (String s: options){
            JButton button = new JButton();
            button.setBounds(i,100,100,50);
            button.setText(s);
            button.addActionListener( (ActionEvent event) ->{
                sell = 0;
                cost = 0;
                profit = 0;
                if ("Total".equals(button.getText())){
                    for (Product p: seller.getListedProducts()){
                        sell += p.getTotalSales();
                        cost += p.getTotalCosts();
                    }
                    profit = sell - cost;
                }
                else {
                    for (Product p: seller.getListedProducts()){
                        if (p.getProductName() == null ? s == null : p.getProductName().equals(s)){
                            sell += p.getTotalSales();
                            cost += p.getTotalCosts();
                        }
                    }
                    
                }
                sellLabel.setText("Revenue: " + sell);
                costLabel.setText("Cost: " + cost);
                profitLabel.setText("Profit: " + profit);
            });
            viewFrame.add(button);
            i += 100;
        }
        backButton.addActionListener( (ActionEvent Event) -> {
            system.setState(1);
            system.changeState();
            viewFrame.dispose();
        });
        viewFrame.add(backButton);
        viewFrame.add(sellLabel);
        viewFrame.add(costLabel);
        viewFrame.add(profitLabel);
        viewFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        viewFrame.setSize(800,800);
        viewFrame.setLayout(null);
        viewFrame.setVisible(true);
    }
}
