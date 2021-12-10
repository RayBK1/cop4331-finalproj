
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
    private double discount;
    public ShoppingCartEntry(Product product, int quantity)
    {
       this.product = product;
       this.quantity = quantity;
       this.discount = 0;
    }
    
    public Product getProduct()
    {
        return this.product;
    }
    
    public void setDiscount(double discount){
        this.discount = discount;
    }
    
    public String String(){
        return "PRODUCT:" + " " + this.product;
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
