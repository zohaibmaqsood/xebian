package com.xeb.employee.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeParser {
    @Bean
    public Jackson2RepositoryPopulatorFactoryBean getRepositoryPopulator() {
        Jackson2RepositoryPopulatorFactoryBean bean = new Jackson2RepositoryPopulatorFactoryBean();
        bean.setResources(new Resource[] { new ClassPathResource("employee.json") });
        return bean;
    }
}
