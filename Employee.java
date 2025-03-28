/*
employee system program
Author:Lenah
Reg no:CT101/G/20075/23
Date:15-march-2025
assignment 
*/
import java.util.Scanner;

// Employee class
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize attributes
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to display employee details
    public void displayDetails(double bonus) {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus (10%): $" + bonus);
    }
}

// SalaryCalculator class
class SalaryCalculator {
    // Method to calculate 10% bonus
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

// MainApp class
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object
        Employee employee = new Employee(name, salary);

        // Calculate bonus
        SalaryCalculator calculator = new SalaryCalculator();
        double bonus = calculator.calculateBonus(salary);

        // Display details
        System.out.println("\n--- Employee Details ---");
        employee.displayDetails(bonus);

        scanner.close();
    }
}
