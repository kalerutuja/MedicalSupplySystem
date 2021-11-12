/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
<<<<<<< HEAD
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
=======
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminAreaJPanel;
>>>>>>> main

/**
 *
 * @author rutuja
 */
<<<<<<< HEAD
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, EcoSystem system) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
public class SystemAdminRole extends Role
{

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem system) {
        System.out.println(userProcessContainer.getComponents());
        return new SystemAdminAreaJPanel(userProcessContainer, system);
>>>>>>> main
    }
    
}
