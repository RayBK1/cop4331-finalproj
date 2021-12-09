
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author garre
 * @param <E>
 */
public class UserList<E> extends LinkedList<E> {
    public User queryUsers(String username, String password)
    {
        for (E e:this)
        {
            User u = (User)e;
            if (u.getUsername().equals(username) && u.getPassword().equals(password))
                return u;
        }
        return null;
    }
}
