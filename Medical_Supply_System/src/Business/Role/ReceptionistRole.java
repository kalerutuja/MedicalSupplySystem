/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Hospital.Receptionist;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ReceptionistRole.ReceptionistWorkAreaJPanel;

/**
 *
 * @author Surbhi
 */
public class ReceptionistRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, EcoSystem system) {
        Receptionist receptionist = (Receptionist) userAccount.getPerson();
        return new ReceptionistWorkAreaJPanel(container, receptionist, system);
        
    }
   
}
