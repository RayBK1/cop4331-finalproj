
import java.util.LinkedList;



/**
 *
 * @author Ray
 */


public class ShoppingCart<E> extends LinkedList<E>  {
    public double totalCost = 0;
    public double discount = 0;
    public int quantity = 0;
    
    public boolean add(E e)
    {
        Product a = (Product) e;
        totalCost += a.getProductPrice();
        return super.add(e);
    }
    public double cost(Product product){
        totalCost += product.getProductPrice();
        return totalCost;
    }
    public double changeDiscountToPercent(){
       discount = discount/100;
       return discount;
    }
    public double addDiscount(){
        return totalCost * (1-discount);
    }
}