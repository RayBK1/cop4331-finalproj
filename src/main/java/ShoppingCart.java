
import java.util.*;


/**
 *
 * @author Ray
 */


public class ShoppingCart<E> extends LinkedList<E> {
    public double totalCost = 0;
    public double discount = 0;
    public int quantity = 0;
    
    public void addItem(Product product, Integer quantity)
    {
        super.add((E) new ShoppingCartEntry(product, quantity));
        this.totalCost += (product.getProductPrice() * quantity);
    }
    
    public void removeItem(Product product)
    {
        ShoppingCartEntry removedProduct = null;
        for (E e:this)
        {
            ShoppingCartEntry s = (ShoppingCartEntry) e;
            if (s.getProduct() == product)
            {
                removedProduct = s;
            }
        }
        super.remove(removedProduct);
    }
    
    public void addQuantity(Product product, Integer quantity)
    {
        for (E e:this)
        {
            ShoppingCartEntry p = (ShoppingCartEntry) e;
            if (p.getProduct() == product)
                p.addToQuantity(quantity);
        }
    }
    
    public void removeQuantity(Product product, Integer quantity)
    {
        for (E e:this)
        {
            ShoppingCartEntry p = (ShoppingCartEntry) e;
            if (p.getProduct() == product)
                p.removeFromQuantity(quantity);
        }
    }
    
    public double addCostOfProduct(Product product){
        this.totalCost += product.getProductPrice();
        return this.totalCost;
    }
    public double changeDiscountToPercent(){
       this.discount = this.discount/100;
       return this.discount;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double addDiscount(){
        return this.totalCost = this.totalCost * (1-this.discount);
    }
}