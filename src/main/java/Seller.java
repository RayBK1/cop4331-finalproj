/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author garre
 */
public class Seller extends User {
    private final ProductList<Product> listedProducts = new ProductList<>();
    
    public Seller(String username, String password, String accountPurpose, ProductList<Product> productList) {
        super(username, password, accountPurpose);
        for (Product p:productList)
            listedProducts.add(p);
    }
    public void addToListedProducts(Product product)
    {
        listedProducts.add(product);
    }
    public void removeFromListedProducts(Product product)
    {
        listedProducts.remove(product);
    }
    
    public ProductList<Product> getListedProducts()
    {
        return this.listedProducts;
    }
}
