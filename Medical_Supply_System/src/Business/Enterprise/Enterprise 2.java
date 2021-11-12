/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.EmployeeDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author rutuja
 */
public abstract class Enterprise 
{
    private String name;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;

   public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        //super(name);
        this.name = name;
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    
    
    public enum EnterpriseType
    {
        Manufacturer("Manufacturer"), Hospital("Hospital"), Supplier("Supplier "), Logistics ("Logistics "); 
        
        private String value;
        
        private EnterpriseType(String value)
        {
            this.value=value;
        }
        
        public String getValue() 
        {
            return value;
        }
        @Override
        public String toString()
        {
        return value;
        }
    }  
}
