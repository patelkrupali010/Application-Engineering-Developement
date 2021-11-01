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
public class PersonDirectory {
    
    private ArrayList <Person> personList;
    
    public PersonDirectory(){
        this.personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(Person person) {
        this.personList.add(person);
    }
    
}
