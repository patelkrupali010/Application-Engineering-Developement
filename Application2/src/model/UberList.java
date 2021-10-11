/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author krupa
 */
public class UberList {
    
    public UberList(){
        this.uberCars = new ArrayList<Uber>(); 
    }
    
    private ArrayList<Uber> uberCars;
    private Date updatedTime;
    private String fileUploadUrl;

    public String getFileUploadUrl() {
        return fileUploadUrl;
    }

    public void setFileUploadUrl(String fileUploadUrl) {
        this.fileUploadUrl = fileUploadUrl;
    }
    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
    public ArrayList<Uber> getUberCars() {
        return uberCars;
    }

    public void setUberCars(ArrayList<Uber> uberCars) {
        this.uberCars = uberCars;
    }

    // adds data to uberList and uber
    public Uber addNewCars(){
        Uber newCars = new Uber();
        uberCars.add(newCars);
        return newCars;
    }
    
}
