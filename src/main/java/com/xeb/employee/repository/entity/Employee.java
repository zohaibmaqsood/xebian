package com.xeb.employee.repository.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Getter
@Setter
public class Employee {
    @Id
    private String code;
    private String firstName;
    private String lastName;
    private String cityCode;
    private String stateCode;
    private String zipCode;
}
