package com.company.projects.exLambda;

import lombok.Data;

@Data
public class Employee {

    private String name;
    private String email;
    private Double salary;

    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }


}
