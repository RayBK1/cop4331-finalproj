

/**
 *
 * @author Ray
 */


public class ShoppingCart {
    public double totalCost = 0;
    public double discount = 0;
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
