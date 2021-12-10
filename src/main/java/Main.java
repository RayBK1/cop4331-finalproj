
import java.io.*;
import java.util.*;
import java.util.logging.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ray
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {   
        /*ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("productList.dat"));
        ProductList<Product> productList = (ProductList<Product>)in1.readObject();*/
        
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("userList.dat"));
        UserList<User> userList = (UserList<User>)in2.readObject();
        
        /*for (Product p:productList)
        {
            System.out.println(p.toString());
        }
        
        for (User u:userList)
        {
            System.out.println(u.getUsername());
        }*/
        /*ProductList<Product> productList = new ProductList<>();
        Product lights = new Product("christmas lights",5,12.43, "Christmas");
        productList.add(lights);
        Product trees = new Product("christmas tree", 10, 21.21, "Christmas");
        productList.add(trees);
        productList.add(new Product("Nikita", 10, 11, "Person"));
        productList.add(new Product("Couch", 15, 300, "Furniture"));
        productList.add(new Product("A", 15, 21, "Furniture"));*/
        /*ProductList<Product> allProducts = new ProductList<>();
        ProductList<Product> productList1 = new ProductList<>();
        productList1.add(new Product("Chair", "Dining Set", 3.00, 5, "Furniture", 5, 10, 1, 15, 7));
        productList1.add(new Product("Table", "Dining Set", 15.00, 5, "Furniture", 0, 0, 0, 0, 0));

        ProductList<Product> productList2 = new ProductList<>();
        productList2.add(new Product("Tree", "Christmas Decorations", 3.00, 5, "Christmas", 0, 0, 0, 0, 0));
        productList2.add(new Product("Lights", "Christmas Decorations", 3.00, 5, "Christmas", 0, 0, 0, 0, 0));
        
        UserList<User> userList = new UserList<>();
        userList.add(new Seller("arman","123","seller", productList1));
        userList.add(new Seller("garrett", "123", "seller", productList2));
        userList.add(new Buyer("mariam","123","buyer"));*/
        
        ShoppingSystem shoppingsystem = new ShoppingSystem(userList);
    }
    
}