package com.rosyidgrobogan.springcreationalpatterns.prototype;

import lombok.Data;

@Data
public class Employee {

    private String id;

    private String name;

    private PositionEnum position;

    private Long salary;

}
