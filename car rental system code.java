/*
car rental system program
Author:Lenah kanana
Reg no:CT101/G/20075/23
Date:15-march-2025
assignment 
*/
public class Car {
    private String licensePlate;
    private boolean isRented;

    // Constructor to set the license plate
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false; // Initially, the car is not rented
    }

    // Method to rent the car (only if it is available)
    public boolean rentCar() {
        if (!isRented) {
            isRented = true;
            return true; // Successfully rented
        }
        return false; // Car is already rented
    }

    // Method to return the car (mark it as available)
    public void returnCar() {
        isRented = false;
    }

    // Getter method to check if the car is rented
    public boolean isRented() {
        return isRented;
    }

    // Getter for license plate
    public String getLicensePlate() {
        return licensePlate;
    }
}
