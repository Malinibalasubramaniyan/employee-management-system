package com.ems.SpringProject.DTO;

public class EmployeeUpdateDTO {
    private int employeeid;

    private String employeename;

    private String employeeaddress;

    private int moblie;

    public EmployeeUpdateDTO(int employeeid, String employeename, String employeeaddress, int moblie) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.moblie = moblie;
    }

    public EmployeeUpdateDTO() {
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
        return "EmployeeDTO{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", employeeaddress='" + employeeaddress + '\'' +
                ", moblie=" + moblie +
                '}';
    }
}
