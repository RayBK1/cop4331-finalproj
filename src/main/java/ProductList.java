package project;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ProductList<E> extends LinkedList<E> {

    public ProductList<Product> limitByProductCategory(String category)
    {
        ProductList<Product> limited_list = new ProductList<>();
        for (E p:this)
        {
           Product a = (Product) p;
           if (a.getProductCategory().equals(category))
               limited_list.add(a);
        }
        return limited_list;
    }
    
    public ProductList<Product> limitByProductPrice(double min, double max)
    {
        ProductList<Product> limited_list = new ProductList<>();
        for (E p:this)
        {
            Product a = (Product) p;
            double price = a.getProductPrice();
            if (price >= min && price <= max)
                limited_list.add(a);
        }
        return limited_list;
    }
    
    
    //next 3 create comparators to sort the list
    public static Comparator<Product> sortByProductName()
    {
        return (Product p1, Product p2) -> p1.getProductName().compareTo(p2.getProductName());
    }
    
    public static Comparator<Product> sortByProductCategory()
    {
        return (Product p1, Product p2) -> {
            int comp_val = p1.getProductCategory().compareTo(p2.getProductCategory());
            if (comp_val == 0)
                return p1.getProductName().compareTo(p2.getProductName());
            return comp_val;
        };
    }
    
    public static Comparator<Product> sortByProductSellingPrice()
    {
        return (Product p1, Product p2) -> {
            double comp_val = p1.getProductPrice() - p2.getProductPrice();
            if (comp_val < 0)
                return -1;
            else if (comp_val > 0)
                return 1;
            return 0;
        };
    }
    
    public static Comparator<Product> sortByProductPopularity()
    {
        return (Product p1, Product p2) -> {
            double comp_val = p1.getProductPopularity() - p2.getProductPopularity();
            if (comp_val < 0)
                return -1;
            else if (comp_val > 0)
                return 1;
            return 0;
        };
    }
    
    public static Comparator<Product> sortByProductRating()
    {
        return (Product p1, Product p2) -> {
            double comp_val = p1.getProductRating() - p2.getProductRating();
            if (comp_val < 0)
                return -1;
            else if (comp_val > 0)
                return 1;
            return 0;
        };
    }
}
