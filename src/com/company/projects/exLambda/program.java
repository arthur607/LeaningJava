package com.company.projects.exLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();


        employees.add(new Employee("arthur", "arthur@gmail.com", 2300.0));
        employees.add(new Employee("fabio", "fabio@gmail.com", 3000.0));
        employees.add(new Employee("bob", "bob@outlook.com", 5000.0));
        employees.stream()
                .filter(x -> x.getSalary() >= 4000.0 && x.getEmail().charAt(0) == 'b')
                .map(x -> x.getSalary() * 10);



    }

}
