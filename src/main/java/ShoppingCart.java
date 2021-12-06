
import java.util.LinkedList;



/**
 *
 * @author Ray
 */


public class ShoppingCart {
    public double totalCost = 0;
    public double discount = 0;
    public int quantity = 0;
    LinkedList<Product> shoppingCart = new LinkedList<>();
    ShoppingCart(){
        //not sure if anything needs to be constructed in a shopping cart, maybe a linkedlist of the products?
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
