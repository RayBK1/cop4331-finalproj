
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author garre
 */
public class ShoppingCartEntry implements Serializable {
    private final Product product;
    private int quantity;
    public ShoppingCartEntry(Product product, int quantity)
    {
       this.product = product;
       this.quantity = quantity;
    }
    
    public Product getProduct()
    {
        return this.product;
    }
    
    @Override
    public String toString(){
        return "Product name: " + this.product + " quantity selected: " + this.quantity;
    }
    
     public int getQuantity()
     {
         return this.quantity;
     }
     
     public void addToQuantity(int quantity)
     {
         this.quantity += quantity;
     }
     
     public void removeFromQuantity(int quantity)
     {
         this.quantity -= quantity;
     }
}
