/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Restaurant extends  UserAccount{
    
    public Restaurant(String userName, String password, String name, String address, String phone) {
        setUsername(userName);
        setPassword(password);
        setRole(new AdminRole());
        this.restaurantId = restaurantId;
        this.restaurantName = name;
        this.restaurantAddress = address;
        this.restaurantContact = phone;
        this.restaurantMenu = new Menu();
    }

    @Override
    public String getRestaurantId() {
        return restaurantId;
    }

    @Override
    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
    
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantContact() {
        return restaurantContact;
    }

    public void setRestaurantContact(String restaurantContact) {
        this.restaurantContact = restaurantContact;
    }

    public Menu getRestaurantMenu() {
        return restaurantMenu;
    }

    public void setRestaurantMenu(Menu restaurantMenu) {
        this.restaurantMenu = restaurantMenu;
    }


    
 
    private String restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantContact;
    private  Menu restaurantMenu;
}
