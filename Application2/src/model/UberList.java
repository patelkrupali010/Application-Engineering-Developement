/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author krupa
 */
public class UberList {
    
    public UberList(){
        this.uberCars = new ArrayList<Uber>(); 
    }
    
    private ArrayList<Uber> uberCars;

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
