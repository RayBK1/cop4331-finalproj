/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author garre
 */
public class Buyer extends User {
    private final ProductList<Product> shoppingCartProducts = new ProductList<>();
    
    public Buyer(String username, String password, String accountPurpose) {
        super(username, password, accountPurpose);
    }
    
    public void addItemToCart(Product product)
    {
        this.shoppingCartProducts.add(product);
    }
    
    public void removeItemFromCart(Product product)
    {
        this.shoppingCartProducts.remove(product);
    }
    
    public ProductList<Product> getShoppingCartProducts()
    {
        return this.shoppingCartProducts;
    }
}
