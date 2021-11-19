/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
   
    
    public List<WorkRequest> getWorkRequestListCustomer(UserAccount account){
        List<WorkRequest> cust = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getCustomer() != null){
                UserAccount customerAccount = workRequest.getCustomer();
                if(customerAccount.getUsername().equals(account.getUsername())){
                    cust.add(workRequest);
                }
            }
        }
        return cust;
    }
    
    public List<WorkRequest> getWorkRequestListRestaurant(UserAccount account){
        List<WorkRequest> restaurant = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getRestaurant() != null){
                UserAccount restuarantAccount = workRequest.getRestaurant();
                if(restuarantAccount.getUsername().equals(account.getUsername())){
                    restaurant.add(workRequest);
                }
            }
        }
        return restaurant;
    }
    
    public List<WorkRequest> getWorkRequestListDeliveryMan(UserAccount account){
        List<WorkRequest> delivery = new ArrayList();
        for(WorkRequest workRequest : workRequestList){
            if(workRequest.getDeliverMan()!= null){
                UserAccount deliveryManAccount = workRequest.getDeliverMan();
                if(deliveryManAccount.getUsername().equals(account.getUsername())){
                    delivery.add(workRequest);
                }
            }
        }
        return delivery;
    }
    
    public void addWorkRequest(WorkRequest workRequest){
       workRequestList.add(workRequest); 
    }
}