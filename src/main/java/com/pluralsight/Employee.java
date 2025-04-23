package com.pluralsight;

public class Employee {

    private  int employeeID;
    private  String name;
    private double hoursWorked;
    private double payRate;

    //Constructor

    public Employee(int employeeID, String name, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getId() {
        return employeeID;
    }

    public void setId(int id) {
        this.employeeID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double  getGrossPay (){


        double grossPay = this.hoursWorked * this.payRate;
        return grossPay ;
    }
}
