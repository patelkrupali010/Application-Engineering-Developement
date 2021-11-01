/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author krupali
 */
public class Visits {

    public Date getVisitOn() {
        return visitOn;
    }

    public void setVisitOn(Date visitOn) {
        this.visitOn = visitOn;
    }
    
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    private  Date visitOn;
    private  VitalSigns vitalSigns;
   
    
}
