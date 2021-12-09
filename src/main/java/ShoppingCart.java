
import java.util.HashMap;
import java.util.LinkedList;



/**
 *
 * @author Ray
 */


public class ShoppingCart extends LinkedHashMap<Product, Integer> {
    public double totalCost = 0;
    public double discount = 0;
    public int quantity = 0;
    
    /*@Override
    public boolean add(Product product, Integer quantity)
    {
        Product a = (Product) e;
        totalCost += a.getProductPrice();
        return super.add(e);
    }*/
    public void createHash(Product product, Integer quantity){
        HashMap<Product, Integer> cartHashMap = new HashMap<>();
        cartHashMap.put(product, quantity);
        ShoppingCart.put(cartHashMap);
    }
    public double addCostOfProduct(Product product){
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