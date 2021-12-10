

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
    private double productSellingPrice;
    private int productQuantity;
    private final String productCategory;
    private final double productRating;
    private final double productPopularity;
    private double productInvoicePrice;
    private double totalProfit;
    private double profitMargin;
    private double totalSales; 
    private double totalCosts;
    
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
        this.totalProfit = 0;
        this.profitMargin = profitMargin;
        this.productID = setProductID(this.productName);
        this.totalSales = 0;
        this.totalCosts = 0;
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
    public double getTotalSales() {
        return this.totalSales;
    }
    public double getTotalCosts() {
        return this.totalCosts;
    }
    public void updateTotalSales(){
        this.totalSales += this.productSellingPrice;
    }
    public void updateTotalCosts() {
        this.totalCosts += this.productInvoicePrice;
    }
    public void updateTotalProfit(){
        this.totalProfit = this.totalSales - this.totalCosts;
    }
    public void updateProductQuantity(int quantity){
        this.productQuantity = quantity;
    }
    public void updateProductInvoicePrice(double invoice){
        this.productInvoicePrice = invoice;
    }
    public void updateProductSellPrice(double sell){
        this.productSellingPrice = sell;
    }
    public void subtractProductQuantity(int quantity){
        this.productQuantity -= quantity;
    }
    @Override
    public String toString(){
        String string = "Product: " + this.productName + " Quantity: " + this.productQuantity +  " Price: "
                + this.productSellingPrice + " ";
        return string;
    }
}
    