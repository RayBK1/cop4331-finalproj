

/**
 *
 * @author Ray
 */


public class ShoppingCart {
    public double totalCost;
    public double discount;
    ShoppingCart(){
    
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
