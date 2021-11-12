/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author rutuja
 */
public class UserAccountDirectory 
{
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        // we applied stream methods filter and findFirst to determine if 
        // the user exists
        Optional<UserAccount> userAccount = userAccountList
                                                .stream()
                                                .filter(ua->ua.getUsername().equals(username) 
                                                        && ua.getPassword().equals(password))
                                                .findFirst();
        return (userAccount.isPresent() ? userAccount.get() : null);
    }
    
    public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        // we applied stream method anyMatch to determine if the username
        // already exists
        return userAccountList
                .stream()
                .anyMatch(ua-> ua.getUsername().equals(username));
    }
}
