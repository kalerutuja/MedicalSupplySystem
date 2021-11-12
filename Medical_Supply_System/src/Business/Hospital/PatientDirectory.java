/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Hospital.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Surbhi
 */
public class PatientDirectory {
    List<Patient> patientList;
    
    public PatientDirectory() {
        patientList = new ArrayList<>();
    }
    
    public void addPatient(Patient patient) {
        patientList.add(patient);
    }
    
    public void removePatient(Patient patient) {
        if(patientList.contains(patient)) {
            patientList.remove(patient);
        }
    }  
 
}
