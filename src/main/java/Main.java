
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ray
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final LinkedList<User> userList = new LinkedList<User>();
        User jake = new User("jake","123","seller"); 
        userList.add(jake);
        User james = new User("james","123","buyer");
        userList.add(james);
        LoginPage loginpage = new LoginPage(userList);
    }
    
}
