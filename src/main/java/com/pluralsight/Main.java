package com.pluralsight;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeReader.readEmployeeFromCSV("payroll.csv");
        for (Employee e1 : employeeList){
            System.out.println(e1.getName());
            System.out.println(e1.getGrossPay());
        }
    }
}