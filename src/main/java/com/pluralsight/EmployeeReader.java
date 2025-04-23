package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.regex.Pattern;

public class EmployeeReader {
    Scanner read = new Scanner(System.in);
    public static List <Employee> readEmployeeFromCSV ( String fileName){

        List<Employee> employeeList = new ArrayList<>();
        // Pseudocode is breaking a problem down in steps
        //
        // Step 0 -try
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            // Skip the first line (it contains column names like id,name,price,stock)
            reader.readLine();

            String line;
            // Step 1 - Read the file
            while ((line = reader.readLine()) != null) {
                // Split the line into parts, using comma as the separator
                String[] parts = line.split("\\|");

                // Check if the line has exactly 4 parts (id, name, hoursWorked, payRate)
                if (parts.length == 4) {
                    // Step 2 - Store the data internally into variables
                    int employeeID = Integer.parseInt(parts[0]);        // Convert the first part to an integer (ID)
                    String name = parts[1];                     // Get the name as text
                    double hoursWorked = Double.parseDouble(parts[2]); // Convert price to a decimal number
                    double payRate = Double.parseDouble(parts[3]);     // Convert stock to an integer

                    // Create a new Employee object using the parts
                    Employee e1 = new Employee(employeeID,name,hoursWorked,payRate);

                    employeeList.add(e1);

                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Step 3 - Create a product
        // Step 4 - Add the product to
        return employeeList;
    }
}
