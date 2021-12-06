
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ray
 */
public final class User {
    private final String accountPurpose; //says whether buyer or seller
    private String username;
    private String password;
    private final int userID;
    User(String username, String password, String accountPurpose){
        this.username = username;
        this.password = password;
        this.accountPurpose = accountPurpose;
        this.userID = setUserID(this.username);
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getAccountPurpose(){
        return this.accountPurpose;
    }
    public int getUserID(){
    return this.userID;
    }
    public int setUserID(String username){
        int h = 0;
        for (int i = 0; i < username.length(); i++) {
            h = 31 * h + username.charAt(i);
        }
        return h;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
