package com.ems.SpringProject.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name= "employee_id", length=50)
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int employeeid;
    @Column(name= "employee_name", length=50)
    private String employeename;
    @Column(name= "employee_address", length=80)
    private String employeeaddress;

    @Column(name= "employee_moblie", length=50)
    private int moblie;

    public Employee(int employeeid, String employeename, String employeeaddress, int moblie) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.moblie = moblie;
    }
    public Employee( String employeename, String employeeaddress, int moblie) {
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.moblie = moblie;
    }
    public Employee() {
    }
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeaddress() {
        return employeeaddress;
    }

    public void setEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress;
    }

    public int getMoblie() {
        return moblie;
    }

    public void setMoblie(int moblie) {
        this.moblie = moblie;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", employeeaddress='" + employeeaddress + '\'' +
                ", moblie=" + moblie +
                '}';
    }
}
