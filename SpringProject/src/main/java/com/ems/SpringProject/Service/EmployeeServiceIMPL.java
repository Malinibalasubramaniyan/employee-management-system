package com.ems.SpringProject.Service;

import com.ems.SpringProject.DTO.EmployeeDTO;
import com.ems.SpringProject.DTO.EmployeeSaveDTO;
import com.ems.SpringProject.DTO.EmployeeUpdateDTO;
import com.ems.SpringProject.Entity.Employee;
import com.ems.SpringProject.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public String addEmployee(EmployeeSaveDTO employeeSaveDTO) {

        Employee employee = new Employee(
                employeeSaveDTO.getEmployeename(),
                employeeSaveDTO.getEmployeeaddress(),
                employeeSaveDTO.getMoblie()
        );
        employeeRepo.save(employee);
        return employee.getEmployeename();


    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> getEmployees = employeeRepo.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();

        for (Employee e : getEmployees) {
            EmployeeDTO employeeDTO = new EmployeeDTO(
                    e.getEmployeeid(),
                    e.getEmployeename(),
                    e.getEmployeeaddress(),
                    e.getMoblie()
            );
            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }

    @Override
    public String UpdateEmployee(EmployeeUpdateDTO employeeUpdateDTO) {

        if (employeeRepo.existsById(employeeUpdateDTO.getEmployeeid())) {
            Employee employee = employeeRepo.getById(employeeUpdateDTO.getEmployeeid());
            employee.setEmployeename(employeeUpdateDTO.getEmployeename());
            employee.setEmployeeaddress((employeeUpdateDTO.getEmployeeaddress()));
            employee.setMoblie(employeeUpdateDTO.getMoblie());

            employeeRepo.save(employee);

        } else {
            System.out.println("Employee ID not Found");
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {
        if (employeeRepo.existsById(id)) {
            employeeRepo.deleteById(id);
        } else {
            System.out.println("Employee ID not Found");
        }
        return true;
    }

}