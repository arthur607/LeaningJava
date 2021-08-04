package com.company.projects.exLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();


        employees.add(new Employee("arthur", "arthur@gmail.com", 2300.0));
        employees.add(new Employee("fabio", "fabio@gmail.com", 3000.0));
        employees.add(new Employee("aaron", "bob@outlook.com", 5000.0));
        employees.add(new Employee("bob", "bobs@outlook.com", 5500.0));

        double sum =  employees.stream()
               .filter(x -> x.getSalary() >= 4000.0 && x.getEmail().charAt(0) == 'b')
               .map(p -> p.getSalary()) //buscando apenas o salário
               .reduce(0.0, (x,y) -> x + y);     //somando os elementos filtrados

      List<String> order = employees.stream()
              .map(p -> p.getName())
              .sorted()    //ordem alfabética
              .collect(Collectors.toList());   //transformando novamente em lista


        order.forEach(System.out :: println);
        System.out.println("-----------------------------");
        System.out.println("sum: "+sum);

    }

}
