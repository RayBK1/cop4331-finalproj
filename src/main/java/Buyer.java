
import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author garre
 */
public class Buyer extends User {
    HashMap<Product, Integer> cartHashMap = new HashMap<>();   
    public Buyer(String username, String password, String accountPurpose) {
        super(username, password, accountPurpose);
        //ShoppingCart<> shoppingCartProducts = new ShoppingCart<>();
    }
    
    public void addItemToCart(Product product, Integer quantity)
    {
        cartHashMap.put(product,quantity);
       // this.shoppingCartProducts.add(cartHashMap);
        cartHashMap.clear();
    }
    
    public void removeItemFromCart(Product product)
    {
        //this.shoppingCartProducts.remove(product);
    }
    
   // public ShoppingCart<HashMap> getShoppingCartProducts()
    {
        //return this.shoppingCartProducts;
    }
}
