
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
        ProductList<Product> productList = (ProductList<Product>)in1.readObject();
        
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("userList.dat"));
        LinkedList<User> userList = (LinkedList<User>)in2.readObject();
        
        for (Product p:productList)
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
        ProductList<Product> allProducts = new ProductList<>();
        ProductList<Product> productList1 = new ProductList<>();
        productList1.add(new Product("Chair", "Filler", 3.00, 5, "Furniture", 5, 10, 1, 15, 7));
        productList1.add(new Product("Table", "Filler", 15.00, 5, "Furniture", 0, 0, 0, 0, 0));
        allProducts.add(new Product("Chair", "Filler", 3.00, 5, "Furniture", 5, 10, 1, 15, 7));
        allProducts.add(new Product("Table", "Filler", 15.00, 5, "Furniture", 0, 0, 0, 0, 0));
        ProductList<Product> productList2 = new ProductList<>();
        productList2.add(new Product("Tree", "Filler", 3.00, 5, "Christmas", 0, 0, 0, 0, 0));
        productList2.add(new Product("Lights", "Filler", 3.00, 5, "Christmas", 0, 0, 0, 0, 0));
        allProducts.add(new Product("Tree", "Filler", 3.00, 5, "Christmas", 0, 0, 0, 0, 0));
        allProducts.add(new Product("Lights", "Filler", 3.00, 5, "Christmas", 0, 0, 0, 0, 0));
        
        
        Product lol1 = new Product("Chair", "Filler", 3.00, 5, "Furniture", 5, 10, 1, 15, 7);
        Product lol2 = new Product("Chair", "Filler", 3.00, 5, "Furniture", 5, 10, 1, 15, 7);
        System.out.println(lol1.equals(lol2));
        
        UserList<User> userList = new UserList<>();
        User jake = new Seller("arman","123","seller", productList1); 
        userList.add(jake);
        userList.add(new Seller("garrett", "123", "seller", productList2));
        
        User james = new Buyer("mariam","123","buyer");
        userList.add(james);
        ///LoginPage loginpage = new LoginPage(userList);
        
        ShoppingSystem shoppingsystem = new ShoppingSystem(userList);
        
        /*ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("productList.dat"));
        out1.writeObject(productList);
        out1.close();
        
        ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream("userList.dat"));
        out2.writeObject(userList);
        out2.close();*/
    }
    
}