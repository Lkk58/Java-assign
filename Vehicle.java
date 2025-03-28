/*
vehicle system program
Author:Lenah
Reg no:CT101/G/20075/23
Date:15-march-2025
assignment 
*/
// Base class Vehicle
class Vehicle {
    protected String brand;
    protected int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to accelerate
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " accelerated by " + increase + " km/h.");
    }

    // Method to apply brakes
    public void brake(int decrease) {
        speed = Math.max(0, speed - decrease);
        System.out.println(brand + " slowed down by " + decrease + " km/h. Current speed: " + speed + " km/h.");
    }

    // Method to show details (to be overridden)
    public void showDetails() {
        System.out.println("Vehicle: " + brand + ", Speed: " + speed + " km/h.");
    }
}

// Subclass Car
class Car extends Vehicle {
    private int fuelLevel; // Fuel level in percentage

    // Constructor
    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    // Method to refuel the car
    public void refuel(int amount) {
        fuelLevel = Math.min(100, fuelLevel + amount);
        System.out.println(brand + " refueled by " + amount + "%. Current fuel level: " + fuelLevel + "%.");
    }

    // Override showDetails method
    @Override
    public void showDetails() {
        System.out.println("Car: " + brand + ", Speed: " + speed + " km/h, Fuel Level: " + fuelLevel + "%.");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    private boolean helmetOn; // Whether the rider is wearing a helmet

    // Constructor
    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    // Method to wear helmet
    public void wearHelmet() {
        helmetOn = true;
        System.out.println(brand + " rider put on a helmet.");
    }

    // Override showDetails method
    @Override
    public void showDetails() {
        System.out.println("Bike: " + brand + ", Speed: " + speed + " km/h, Helmet On: " + helmetOn);
    }
}
