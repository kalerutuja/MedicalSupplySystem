/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Hospital;
import Business.Hospital.Doctor;
import Business.Hospital.Receptionist;
import Business.Role.DoctorRole;
import Business.Role.ReceptionistRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rutuja
 */
public class ConfigureASystem 
{
   public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        // Add hospital
        Hospital bostonHospital = (Hospital) system.getEnterpriseDiretory()
                .createAndAddEnterprise("Boston Children Hospital", Enterprise.EnterpriseType.Hospital);
        
        // Add Receptionist
        UserAccount recepUserAccount = system
                .getUserAccountDirectory()
                .createUserAccount("reception", "password", new ReceptionistRole());
        
        Receptionist receptionist = new Receptionist();
        receptionist.setUserAccount(recepUserAccount);
        receptionist.setHospital(bostonHospital);
        bostonHospital.setReceptionist(receptionist);
        
        // Add Doctor One
        UserAccount doctorOneUA = system
                .getUserAccountDirectory()
                .createUserAccount("doctorOne", "password", new DoctorRole());
        
        Doctor doctorOne = new Doctor(doctorOneUA);
        doctorOneUA.setPerson(doctorOne);
        
        bostonHospital.getDoctorDirectory().addDoctor(doctorOne);
        
        // Add Doctor Two
        UserAccount doctorTwoUA = system
                .getUserAccountDirectory()
                .createUserAccount("doctorTwo", "password", new DoctorRole());
        
        Doctor doctorTwo = new Doctor(doctorTwoUA);
        doctorTwoUA.setPerson(doctorOne);
        
        bostonHospital.getDoctorDirectory().addDoctor(doctorTwo);
        
        return system;
    }
   
   
    
}
