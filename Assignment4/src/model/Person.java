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
public class Person {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public Date getDOB() {
//        return DOB;
//    }
//
//    public void setDOB(Date DOB) {
//        this.DOB = DOB;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }  

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
        public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    } 
    
    public String firstName;
    private String lastName;
//    private Date DOB;
    private String email;
    private String contactNo;
    private House house;
    private Patient patient;
    private int age;




    


    
}
