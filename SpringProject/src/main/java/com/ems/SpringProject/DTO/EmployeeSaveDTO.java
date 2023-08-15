package com.ems.SpringProject.DTO;

public class EmployeeSaveDTO {

    private String employeename;
    private String employeeaddress;
    private int moblie;

    public EmployeeSaveDTO(String employeename, String employeeaddress, int moblie) {
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.moblie = moblie;
    }

    public EmployeeSaveDTO() {
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
        return "EmployeeSaveDTO{" +
                "employeename='" + employeename + '\'' +
                ", employeeaddress='" + employeeaddress + '\'' +
                ", moblie=" + moblie +
                '}';
    }
}
