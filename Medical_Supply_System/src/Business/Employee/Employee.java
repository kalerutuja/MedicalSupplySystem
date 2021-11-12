/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author rutuja
 */
public class Employee 
{
    private String EmployeeName;
    private int EmployeeID;

    public Employee(int count) {
        EmployeeID = count;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    @Override
    public String toString() {
        return "Employee{" + "EmployeeName=" + EmployeeName + '}';
    }
}
