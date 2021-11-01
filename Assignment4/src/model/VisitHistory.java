/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author krupali
 */
public class VisitHistory {
    
    private  ArrayList<Visits> visitHistory;

    public VisitHistory(){
        if(this.visitHistory  == null || this.visitHistory.isEmpty()){
        visitHistory = new ArrayList<>();
        }
    }
       
    public ArrayList<Visits> getVisitHistory() {
        return visitHistory;
    }

    public void setVisitHistory(Visits visits) {
        this.visitHistory.add(visits);
    }
    

    
}
