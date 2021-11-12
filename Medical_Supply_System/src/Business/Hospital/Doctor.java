/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Surbhi
 */
public class Doctor extends Person {
    
    UserAccount userAccount;
    List<Patient> assignedPatients;
    
    public Doctor(UserAccount userAccount) {
        this.userAccount = userAccount;
        userAccount.setPerson(this);
        assignedPatients = new ArrayList<>();     
    }
    
    public void assignNewPatient(Patient patient) {
        assignedPatients.add(patient);
    }
    
    public void removePatient(Patient patient) {
        if(assignedPatients.contains(patient)) {
            assignedPatients.remove(patient);
        }
    }  

    public UserAccount getUserAccount() {
        return userAccount;
    }

}
