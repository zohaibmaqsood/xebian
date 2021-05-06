package com.xeb.employee.controllers;

import com.xeb.employee.model.Employee;
import com.xeb.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;
import java.util.List;

@RestController
@Validated
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/list/{zipCode}")
    public List<Employee> getAllEmployees(@PathVariable("zipCode") @Size(min=5, max = 5) String zipCode) {
        return employeeService.getEmployees(zipCode);
    }
}
