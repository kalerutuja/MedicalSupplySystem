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
public class AppointmentHistory {
    
    List<Appointment> appointmentList;
    
    public AppointmentHistory() {
        appointmentList = new ArrayList<>();
    }
    
    public void addAppointment(Appointment appointment) {
        appointmentList.add(appointment);
    }
    
    public void removeAppointment(Appointment appointment) {
        appointmentList.remove(appointment);
    }
}
