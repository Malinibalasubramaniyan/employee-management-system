package com.ems.SpringProject.Service;

import com.ems.SpringProject.DTO.EmployeeDTO;
import com.ems.SpringProject.DTO.EmployeeSaveDTO;
import com.ems.SpringProject.DTO.EmployeeUpdateDTO;

import java.util.List;

public interface EmployeeService {
    String addEmployee(EmployeeSaveDTO employeeSaveDTO);

    List<EmployeeDTO> getAllEmployees();

    String UpdateEmployee(EmployeeUpdateDTO employeeUpdateDTO);

    boolean deleteEmployee(int id);
}
