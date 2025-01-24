/*
Bonus code
Author:Lenah Kanana.
Reg no:CT101/G/20075/23
Date:22-Jan-2025
assignment 3
*/
import java.util.Scanner;//imports the scanner
public class BonusProgram {
    public static void main(String[] args) {
    
        double salary = 50000; // Replace with the employee's salary
        int yearsOfService = 8; // Replace with the employee's years of service
       
       // Initialize bonus percentage
        double bonusPercentage;

        //calculate employee bonus percentage based on years of service
        if (yearsOfService > 10) {
            bonusPercentage = 12;
        } else if (yearsOfService >= 6 && yearsOfService <= 10) {
            bonusPercentage = 10;
        } else {
            bonusPercentage = 8;
        }

        // Calculate bonus amount of each employee
        double bonusAmount = (bonusPercentage / 100) * salary;

        // Print the result and close the system
        System.out.println("Employee Salary: $" + salary);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Net Bonus Amount: $" + bonusAmount);
    }
}
