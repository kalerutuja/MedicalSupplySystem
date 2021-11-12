/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Surbhi
 */
public class DoctorDirectory {
    
    List<Doctor> doctorList;
    
    public DoctorDirectory() {
        doctorList = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor) {
        doctorList.add(doctor);
    }
    
    
    public void removeDoctor(Doctor doctor) {
        if(doctorList.contains(doctor)) {
            doctorList.remove(doctor);
        }
    }
}
