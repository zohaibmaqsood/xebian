package com.xeb.employee.services;

import com.xeb.employee.model.Employee;
import com.xeb.employee.repository.EmployeeRepository;
import com.xeb.employee.repository.RepositoryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeService {
    private List<Employee> employees = null;
    @Autowired
    private RepositoryFactory _factory;
    public EmployeeService() {
        employees = new ArrayList<>();
    }
    public List<Employee> getEmployees(String zipCode) {
        var last =  employees.stream()
                .filter(employee -> zipCode.equals(employee.getZipCode()))
                .collect(Collectors.toList());
        if(last.isEmpty()) {
            _factory.getInstance(true).findByZipCode(zipCode)
                    .forEach(employee -> employees.add(new Employee(employee)));
            return employees.stream().filter(employee -> zipCode.equals(employee.getZipCode()))
                    .collect(Collectors.toList());
        }
        return last;
    }

}
