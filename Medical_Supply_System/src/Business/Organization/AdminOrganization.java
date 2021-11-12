/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class AdminOrganization extends Organization
{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
     
    public ArrayList<Role>getSupportedRole()
    {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
        
        
    }
}
