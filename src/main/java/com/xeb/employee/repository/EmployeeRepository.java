package com.xeb.employee.repository;

import com.xeb.employee.repository.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Spring> {
    public List<Employee> findByZipCode(String zipCode);
}
