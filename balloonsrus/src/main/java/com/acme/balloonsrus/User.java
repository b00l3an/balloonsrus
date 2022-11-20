
package com.acme.balloonsrus;

import java.util.ArrayList;

/**
 *
 * @author Brendan
 */
public class User {
    private String name;
    private String email;
    //private int account;
    private ArrayList<Integer> orders;
    
    public User(String name, String email){
        this.name = name;
        this.email = email;
        //this.account = account;
        this.orders = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Integer> getOrders() {
        return orders;
    }
    
}
