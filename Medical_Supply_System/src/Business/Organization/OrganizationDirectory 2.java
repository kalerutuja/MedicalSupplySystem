/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.MedicalEquipment.getValue())) {
            organization = new MedicalEquipmentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.MedicalEssentials.getValue())){
            organization = new MedicalEssentialOrganization();

            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.ManufacturerPharmacy.getValue())) {
            organization = new ManufacturerPharmacyOrganization();

            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(Organization.Type.clinics.getValue())) {
            organization = new ClinicOrganization();
           organizationList.add(organization);

        } else if (type.getValue().equals(Organization.Type.Insurance.getValue())){
            organization = new InsuranceOrganization();
            organizationList.add(organization);
            
        } else if (type.getValue().equals(Organization.Type.AirTransport.getValue())){
            organization = new AirTransportOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.RoadTransport.getValue())){
            organization = new RoadTransportOrganization(); 
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.SupplierMedicalEquipment.getValue())){
            organization = new SupplierMedicalEquipmentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.SupplierMedicalEssentials.getValue())){
            organization = new SupplierMedicalEssentialsOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
