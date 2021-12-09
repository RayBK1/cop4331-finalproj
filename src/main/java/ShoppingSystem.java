/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author garre
 */
public class ShoppingSystem {
    private final ProductList<Product> productList = new ProductList<>();
    private final UserList<User> userList = new UserList<>();
    
    private int state = 0;
    private User currentUser;
    
    private static final int LOGIN = 0;
    private static final int HOMEPAGE = 1;
    private static final int CART = 2;
    private static final int PROFILE = 3;
    private static final int CHECKOUT = 4;
    
    public ShoppingSystem(UserList<User> userList)
    {
        
        for (User u:userList)
        {
            this.userList.add(u);
            if (u.getClass().getSimpleName().equals("Seller"))
            {
                Seller s = (Seller) u;
                for (Product p: s.getListedProducts())
                    this.productList.add(p);
            }
        }
        changeState();
    }
    
    public void setUser(User user)
    {
        this.currentUser = user;
    }
    
    public void setState(int state)
    {
        this.state = state;
    }
    
    public void changeState()
    {
        if (state == LOGIN)
            login();
        else if (state == HOMEPAGE)
            homepage();
        else if (state == CART)
            cart();
        else if (state == PROFILE)
            profile();
        else if (state == CHECKOUT)
            checkout();
    }
    
    public void login()
    {
        LoginPage2 login = new LoginPage2(userList, this);
    }
    
    public void homepage()
    {
        System.out.println(currentUser.getClass());
    }
    
    public void cart()
    {
        
    }
    
    public void profile()
    {
        
    }
    
    public void checkout()
    {
        
    }
}
