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
    private static final int SELLDATA = 5;
    private static final int CREATE = 6;
    
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
    public ProductList<Product> getProductList(){
        return this.productList;
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
        else if (state == SELLDATA)
            selldata();
        else if (state == CREATE)
            create();
    }
    
    public void login()
    {
        LoginPage2 login = new LoginPage2(userList, this);
    }
    
    public void homepage()
    {
        if (this.currentUser.getClass().getSimpleName().equals("Seller")){
            SellerHomePage sellerhomepage = new SellerHomePage(this.currentUser, this);
        }
        else{
            BuyerHomePage buyerhomepage = new BuyerHomePage((Buyer) this.currentUser,this);
        }
    }
    
    public void cart()
    {
        
    }
    
    public void profile()
    {
        if (this.currentUser.getClass().getSimpleName().equals("Seller")){
            SellerAccountPage selleraccountpage = new SellerAccountPage(this.currentUser, this);
        }
        else{
            BuyerAccountPage buyeraccountpage = new BuyerAccountPage(this.currentUser,this);
        }    
    }
    
    public void checkout()
    {
       CheckoutPage checkout = new CheckoutPage(this.currentUser, this);
    }
    
    public void selldata()
    {
        ViewSellData selldata = new ViewSellData(this.currentUser, this);
    }
    
    public void create()
    {
        CreateNewProduct newproduct = new CreateNewProduct(this.currentUser,this);
    }
}
