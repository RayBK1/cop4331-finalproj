
/**
 *
 * @author Ray
 */


public class Product {
    private final int productID;
    private final String productName;
    private final int productQuantity;
    private final double productPrice;
    Product(String productName, int quantity, double price){
        this.productName = productName;
        this.productQuantity= quantity;
        this.productPrice = price;
        this.productID = setProductID(this.productName);
    }
    public static int setProductID(String name){
        int h = 0;
        for (int i = 0; i < name.length(); i++) {
            h = 31 * h + name.charAt(i);
        }
        return h;
    }
    public String getProductName(){
        return this.productName;
    }
    public int getProductQuantity(){
        return this.productQuantity;
    }
    public double getProductPrice(){
        return this.productPrice;
    }
    @Override
    public String toString(){
        String string = "Product: " + this.productName + "Quantity: " + this.productQuantity +  "Price: " + this.productPrice;
        return string;
    }
}
    
