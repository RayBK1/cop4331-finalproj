
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ray
 */
public class SellerHomePage implements ActionListener {
    JFrame sellerHomeFrame = new JFrame();
    JButton yourAccount = new JButton("Your Account");
    JLabel welcomeUser = new JLabel();
    JLabel productListings = new JLabel("Your Listiings");

    LinkedList<Product> productList = new LinkedList<>();
    private final User seller;
    SellerHomePage (User user){
        seller = user;
        welcomeUser.setText("Welcome, " + user.getUsername());
        welcomeUser.setBounds(0,0,200,20);
        yourAccount.setBounds(200,0,200,20);
        productListings.setBounds(133,50,200,20);
        yourAccount.addActionListener(this);
        //Iterator<Product> it = productList.iterator();
        // while(it.hasNext()){
            //JTextField productText = new JTextField();
            //trying to populate products in the text field (only ones they listed)
            //don't know how to get the list of products to use iterator pattern here
            //will have to add action listener for like a view more about product button to see their revenue
            //sales quantity etc using a popup tag if its clicked
        //}
        sellerHomeFrame.add(productListings);
        sellerHomeFrame.add(welcomeUser);
        sellerHomeFrame.add(yourAccount);
        sellerHomeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        sellerHomeFrame.setSize(400,400);
        sellerHomeFrame.setLayout(null);
        sellerHomeFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
     if (e.getSource() == yourAccount){
         SellerAccountPage buyerAccount = new SellerAccountPage(seller);
         sellerHomeFrame.dispose();
     }   
    }
}