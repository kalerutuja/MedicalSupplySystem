/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Enterprise.Hospital;
import Business.Person.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Surbhi
 */
public class Receptionist extends Person {
    UserAccount userAccount;
    Hospital hospital;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
        userAccount.setPerson(this);
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
}
