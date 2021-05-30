package com.rosyidgrobogan.springcreationalpatterns.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PrototypeAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype(){
        Employee tegar = applicationContext.getBean("employeeStaff", Employee.class);
        tegar.setName("Tegar");

        Employee panji = applicationContext.getBean("employeeManager", Employee.class);
        panji.setName("Panji");

        Employee rosyid = applicationContext.getBean("employeeVicePresident", Employee.class);
        rosyid.setName("Rosyid");

        Employee dhimas = applicationContext.getBean("employeeCLevel", Employee.class);
        dhimas.setName("Dhimas");

        System.out.println(tegar); // Employee(id=null, name=Tegar, position=STAFF, salary=10000000)
        System.out.println(panji); // Employee(id=null, name=Panji, position=MANAGER, salary=20000000)
        System.out.println(rosyid); // Employee(id=null, name=Rosyid, position=VICE_PRESIDENT, salary=30000000)
        System.out.println(dhimas); // Employee(id=null, name=Dhimas, position=C_LEVEL, salary=40000000)

        // Cara jika tidak menggunakan Prototype Pattern
        // cara ini rentan terjadi kesalahan
        Employee fulan = new Employee();
        fulan.setName("Fulan");
        fulan.setSalary(50_000_000L);
        fulan.setPosition(PositionEnum.STAFF);

        System.out.println(fulan); // Employee(id=null, name=Fulan, position=STAFF, salary=50000000)
    }
}