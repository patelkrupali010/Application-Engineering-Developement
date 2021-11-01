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
public class PatientDirectory {
    private ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        this.patientList = new ArrayList<>();
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(Patient patient) {
        this.patientList.add(patient);
    }

    
    
}
