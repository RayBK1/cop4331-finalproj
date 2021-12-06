
import java.awt.event.*;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.*;
import com.sun.tools.javac.Main.java;

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
    LinkedList<Product> productList = new LinkedList<>();
    BuyerHomePage(User user){
        Iterator<Product> it = productList.iterator();
        welcomeUser.setText("Welcome, " + user.getUsername());
        yourAccount.addActionListener(this);
        checkout.addActionListener(this);
        buyerHomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buyerHomeFrame.setSize(400,400);
        buyerHomeFrame.setLayout(null);
        buyerHomeFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}
