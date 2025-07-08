package Assignment2_EmployeeDirectory;
/*
  EmployeeDirectory.java

  This program simulates an employee directory system that supports:
  - Fetching employee details by ID
  - Deleting an employee by ID

  It uses a HashMap to store employee data and a custom exception `EmployeeNotFoundException`
  to handle cases where an employee ID is not found.

  Concepts Used:
  - HashMap for key-value storage
  - Custom Checked Exception (extends Exception)
  - Exception handling using try-catch
  - Basic Scanner input
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDirectory {
    // Static HashMap to simulate employee ID to name mapping
    private static Map<Integer, String> employeeMap = new HashMap<>();

    /**
     * Fetches an employee by ID.
     * Throws EmployeeNotFoundException if the ID is not present in the map.
     */
    public static void fetchEmployee(int id) throws EmployeeNotFoundException {
        if (!employeeMap.containsKey(id)) {
            // Throw custom exception if employee is not found
            throw new EmployeeNotFoundException(id);
        }
        // If found, print employee name
        System.out.println("Employee: " + employeeMap.get(id));
    }

    /**
     * Deletes an employee by ID.
     * Throws EmployeeNotFoundException if the ID is not present in the map.
     */
    public static void deleteEmployee(int id) throws EmployeeNotFoundException {
        if (employeeMap.remove(id) == null) {
            // If remove returns null, it means no entry was found for the ID
            throw new EmployeeNotFoundException(id);
        }
        // If deletion was successful
        System.out.println("Employee with ID " + id + " deleted.");
    }

    public static void main(String[] args) {
        // Preloading some employee data into the map
        employeeMap.put(101, "Saniya");
        employeeMap.put(102, "Harshada");
        employeeMap.put(103, "Sanika");
        employeeMap.put(104, "Janhavi");


        Scanner scanner = new Scanner(System.in);

        try {
            // Asking user to enter ID for fetching
            System.out.print("Enter employee ID to fetch: ");
            fetchEmployee(scanner.nextInt());  // May throw exception

            // Asking user to enter ID for deleting
            System.out.print("Enter employee ID to delete: ");
            deleteEmployee(scanner.nextInt());  // May throw exception

        } catch (EmployeeNotFoundException e) {
            // Handling the exception and printing a meaningful message
            System.out.println(e.getMessage());
        }
    }
}
