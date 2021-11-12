/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

<<<<<<< HEAD:Medical_Supply_System/src/Business/Enterprise/Hospital.java
import Business.Hospital.DoctorDirectory;
import Business.Hospital.PatientDirectory;
import Business.Hospital.Receptionist;
=======
import Business.Role.Role;
import java.util.ArrayList;
>>>>>>> main:Medical_Supply_System/src/Business/Enterprise/HospitalEnterprise.java

/**
 *
 * @author rutuja
 */
public class HospitalEnterprise extends Enterprise
{
<<<<<<< HEAD:Medical_Supply_System/src/Business/Enterprise/Hospital.java
    
    DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    Receptionist Receptionist;
    
    
     public Hospital(String name)
=======
     public HospitalEnterprise(String name)
>>>>>>> main:Medical_Supply_System/src/Business/Enterprise/HospitalEnterprise.java
    {
      super(name, Enterprise.EnterpriseType.Hospital);
      doctorDirectory = new DoctorDirectory();
      patientDirectory = new PatientDirectory();
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public Receptionist getReceptionist() {
        return Receptionist;
    }
     
     public void setReceptionist(Receptionist receptionist) {
         this.Receptionist = receptionist;
     }
}
