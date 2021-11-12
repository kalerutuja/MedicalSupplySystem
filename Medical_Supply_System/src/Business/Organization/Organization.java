/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Products.ProductDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ProductDirectory productDirectory;
    private int organizationID;
    private static int counter=0;
    public ArrayList<Role> roles;
    private Type type;
    
    
     public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        productDirectory = new ProductDirectory();
        organizationID = counter;
        roles = new ArrayList<Role>();
        ++counter;
    }

   public enum Type
   {
       
        Admin("AdminOrganization"),
        MedicalEquipment("MedicalSupplyOrganization"), 
        MedicalEssentials("MedicalEssentials Organization"), 
        ManufacturerPharmacy("ManufacturerPharmacy Organization"), 
        RoadTransport("RoadTransport Organization"),                                   
        AirTransport("Air Transport Organization"),            
        Insurance("Insurance Organization"),                                            
        Doctor("Doctor Organization"),
        clinics("Clinic Organization"),
        SuplierPharmacyOrg("SupplierPharmacy Organization"),                            
        SupplierMedicalEssentials("supplier medical supply Organization"),
        SupplierMedicalEquipment("Supplier Medical Equipments Organization");
        
        private String value;
        private Type(String value) 
        {
            this.value = value;
        }
        public String getValue()
        {
            return value;
        }

        @Override
        public String toString() {
            return "Type{" + "value=" + value + '}';
        }    
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
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

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Organization{" + "name=" + name + '}';
    }
   
   
   
}
