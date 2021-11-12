/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Person.Person;

/**
 *
 * @author Surbhi
 */
public class Patient extends Person{
    
    Doctor assignedDoctor;
    AppointmentHistory appointmentHistory;
    
    public Patient() {
        super();
        appointmentHistory = new AppointmentHistory();
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public AppointmentHistory getAppointmentHistory() {
        return appointmentHistory;
    }

    public void setAppointmentHistory(AppointmentHistory appointmentHistory) {
        this.appointmentHistory = appointmentHistory;
    }
}
