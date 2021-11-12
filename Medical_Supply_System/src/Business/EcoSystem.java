/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

<<<<<<< HEAD
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.Hospital;
=======
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
>>>>>>> main
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class EcoSystem extends Organization
{
    private static EcoSystem business;
<<<<<<< HEAD
    private UserAccountDirectory userAccountDirectory;
    private EnterpriseDirectory enterpriseDiretory;
    
    private EcoSystem() {
        // using Singleton Pattern, we will only have one instance of Ecosystem 
        // at all times
        userAccountDirectory = new UserAccountDirectory();
        enterpriseDiretory = new EnterpriseDirectory();
=======
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
>>>>>>> main
    }

    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {
        }

        return true;
    }

<<<<<<< HEAD
    public EnterpriseDirectory getEnterpriseDiretory() {
        return enterpriseDiretory;
    }
    
    
=======
>>>>>>> main
}
