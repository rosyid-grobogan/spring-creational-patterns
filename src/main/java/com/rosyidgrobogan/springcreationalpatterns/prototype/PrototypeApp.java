package com.rosyidgrobogan.springcreationalpatterns.prototype;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApp {

    @Bean
    @Scope("prototype")
    public Employee employeeStaff(){
        Employee employee = new Employee();
        employee.setPosition(PositionEnum.STAFF);
        employee.setSalary(10_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager(){
        Employee employee = new Employee();
        employee.setPosition(PositionEnum.MANAGER);
        employee.setSalary(20_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeVicePresident(){
        Employee employee = new Employee();
        employee.setPosition(PositionEnum.VICE_PRESIDENT);
        employee.setSalary(30_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeCLevel(){
        Employee employee = new Employee();
        employee.setPosition(PositionEnum.C_LEVEL);
        employee.setSalary(40_000_000L);
        return employee;
    }
}
