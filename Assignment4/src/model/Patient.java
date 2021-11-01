/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author krupali
 */
public class Patient{

    public String getPatientId() {
        return PatientId;
    }

    public void setPatientId(String PatientId) {
        this.PatientId = PatientId;
    }

    public VisitHistory getVisitHistory() {
        return visitHistory;
    }

    public void setVisitHistory(VisitHistory visitHistory) {
        this.visitHistory = visitHistory;
    }
    


    
    private String PatientId;
    private VisitHistory visitHistory;  


    
    
}
