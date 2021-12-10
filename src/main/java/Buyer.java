
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
    ShoppingCart<ShoppingCartEntry> shoppingCart = new ShoppingCart<>();   
    public Buyer(String username, String password, String accountPurpose) {
        super(username, password, accountPurpose);
        //ShoppingCart<> shoppingCartProducts = new ShoppingCart<>();
    }
    
    public ShoppingCart<ShoppingCartEntry> getCart()
    {
        return shoppingCart;
    }
    public void clearCart(){
        shoppingCart = new ShoppingCart<>();
    }
    public void removeItemFromCart(Product product)
    {
       //future implementation
    }
}
