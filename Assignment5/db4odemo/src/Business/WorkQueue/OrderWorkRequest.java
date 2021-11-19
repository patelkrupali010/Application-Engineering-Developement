/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author krupali
 */
public class OrderWorkRequest extends WorkRequest{
    
    private String id;
    
    private List<AddToCart> cartItemsList = new ArrayList<AddToCart>();
    
    public OrderWorkRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    public String getId() {
        return id;
    }
    
     public AddToCart addItem(AddToCart cartItems){
        cartItemsList.add(cartItems);
        return (AddToCart) cartItemsList;
    }

    public List<AddToCart> getItemsWithQuatityList() {
        return cartItemsList;
    }

    public void setItemsWithQuatityList(List<AddToCart> cartItemsList) {
        this.cartItemsList = cartItemsList;
    }
         
}
