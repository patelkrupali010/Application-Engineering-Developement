/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class DeliveryMan extends  UserAccount{

    public String getDeliveryManId() {
        return DeliveryManId;
    }

    public void setDeliveryManId(String DeliveryManId) {
        this.DeliveryManId = DeliveryManId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    private String DeliveryManId;
    private String name;
    private String phone;
    
     public DeliveryMan(String userName, String password, String name,  String phone) {
        setUsername(userName);
        setPassword(password); 
        setRole(new DeliverManRole());
        this.name = name;
        this.phone = phone;
        
    }
    
}
