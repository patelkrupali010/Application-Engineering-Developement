/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.swing.JComboBox;

/**
 *
 * @author krupa
 */
public class Uber {

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public int getCarManufacturingYear() {
        return carManufacturingYear;
    }

    public void setCarManufacturingYear(int carManufacturingYear) {
        this.carManufacturingYear = carManufacturingYear;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getMaintenanceExpiryCerti() {
        return maintenanceExpiryCerti;
    }

    public void setMaintenanceExpiryCerti(Date maintenanceExpiryCerti) {
        this.maintenanceExpiryCerti = maintenanceExpiryCerti;
    }

    public String getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(String isExpired) {
        this.isExpired = isExpired;
    }
    
    
    private String carName;
    private boolean isAvailable;
    private String carManufacturer;
    private int carManufacturingYear;
    private int numOfSeats;
    private String serialNum;
    private String modelNum;
    private String city;
    private Date maintenanceExpiryCerti; 
    private String isExpired;

    
    
          
    
    
        
  
    
}
