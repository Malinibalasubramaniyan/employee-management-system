package com.ems.SpringProject.Controller;


import com.ems.SpringProject.DTO.EmployeeDTO;
import com.ems.SpringProject.DTO.EmployeeSaveDTO;
import com.ems.SpringProject.DTO.EmployeeUpdateDTO;
import com.ems.SpringProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path="/save")
     public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO)
      {
         String id = employeeService.addEmployee(employeeSaveDTO);
         return id;
    }
    @GetMapping(path = "/getAllEmployee")
            public List<EmployeeDTO> getAllEmployee()
    {
           List<EmployeeDTO>allEmployees = employeeService.getAllEmployees();
           return allEmployees;
    }
    @PutMapping(path = "/update")
    public String updateEmployee(@RequestBody EmployeeUpdateDTO employeeUpdateDTO)
    {
        String id = employeeService.UpdateEmployee(employeeUpdateDTO);
        return id;
    }
    @DeleteMapping(path = "/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id")int id)
    {
        boolean deleteEmployee = employeeService.deleteEmployee(id);
        return "deleted";
    }
}