package com.company.projects;

import com.company.projects.entities.Department;
import com.company.projects.entities.Worker;
import com.company.projects.entities.enums.WorkerLevel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name:");
        String departmentName = sc.nextLine();
        System.out.print("Enter worker data:");
        String workerName = sc.nextLine();
        System.out.print("Level:");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary:");
        Double workerSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel) , workerSalary, new Department(departmentName));

        System.out.println("how many contracts to this worker?");
        int numberOfContracts = sc.nextInt();

        for (int i = 1; i < numberOfContracts; i++) {
            
        }
    }

}
