/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author rutuja
 */
public abstract class Role {

    public abstract Component createWorkArea(JPanel container, UserAccount userAccount, EcoSystem system);
    
}
