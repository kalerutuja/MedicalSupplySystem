/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;

/**
 *
 * @author rutuja
 */
public class Enterprise
{
    String name;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
     public Enterprise(String name,EnterpriseType type)
     {
        this.name = name;
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
     }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
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
