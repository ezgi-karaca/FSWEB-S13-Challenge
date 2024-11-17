package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {
        runExample();
    }

    public static void runExample() {
        Healthplan healthplan1 = new Healthplan(1, "HealthPlan1", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "HealthPlan2", Plan.PREMIUM);


        String[] healthPlans = new String[5];
        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", healthPlans);

        employee.addHealthPlan(0, "HealthPlan1");
        employee.addHealthPlan(1, "HealthPlan2");

        String[] developers = new String[5];
        Company company = new Company(1, "TechCorp", 1000000, developers);

        company.addEmployee(0, "John Doe");
        company.addEmployee(1, "Jane Smith");

        System.out.println(healthplan1);
        System.out.println(healthplan2);
        System.out.println(employee);
        System.out.println(company);
    }
}
