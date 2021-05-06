package com.xeb.employee.repository;

import com.xeb.employee.utils.EmployeeParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositoryFactory {
    @Autowired private EmployeeParser parser;
    @Autowired private EmployeeRepository repository;
    public EmployeeRepository getInstance(boolean json) {
        if(json == true) {
            parser.getRepositoryPopulator();
        }
        return repository;
    }
}
