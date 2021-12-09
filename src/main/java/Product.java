

import java.io.*;
import java.util.*;


/**
 *
 * @author Ray
 */


public class Product implements Serializable {
    private final String productName;
    private final String productDescription;
    private final int productID;
    private final double productSellingPrice;
    private final int productQuantity;
    private final String productCategory;
    private final double productRating;
    private final double productPopularity;
    private final double productInvoicePrice;
    private final double productRevenue;
    private final double productProfitMargin;
    
    Product(String name, String description, double sellingPrice, int quantity,
            String category, double rating, double popularity,
            double invoicePrice, double revenue, double profitMargin)
    {
        this.productName = name;
        this.productDescription = description;
        this.productSellingPrice = sellingPrice;
        this.productQuantity = quantity;
        this.productCategory = category;
        this.productRating = rating;
        this.productPopularity = popularity;
        this.productInvoicePrice = invoicePrice;
        this.productRevenue = revenue;
        this.productProfitMargin = profitMargin;
        this.productID = setProductID(this.productName);
    }
    
    public final int setProductID(String name){
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
        return this.productSellingPrice;
    }
    public String getProductCategory(){
        return this.productCategory;
    }
    public double getProductPopularity() {
        return this.productPopularity;
    }
    public double getProductRating() {
        return this.productRating;
    }
    @Override
    public String toString(){
        String string = "Product: " + this.productName + "Quantity: " + this.productQuantity +  "Price: " + this.productSellingPrice;
        return string;
    }
}
    