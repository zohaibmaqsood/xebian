package com.xeb.employee.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Employee {
    private String code;
    private String firstName;
    private String lastName;
    private String fullName;
    private String cityCode;
    private String stateCode;
    private String zipCode;

    public Employee(com.xeb.employee.repository.entity.Employee employee) {
        this.code = employee.getCode();
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.fullName = this.lastName.concat(", ").concat(this.firstName);
        this.cityCode = employee.getCityCode();
        this.stateCode = employee.getStateCode();
        this.zipCode = employee.getZipCode();
    }
}
