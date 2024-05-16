package oops_assignment;
interface Vehicle {
    void accelerate();
    void brake();
}

// Car.java
class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

    // Method Overloading
    public void accelerate(int speed) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds.");
    }
}

// Bicycle.java
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking.");
    }

    // Method Overloading
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at speed: " + speed + " km/h for " + duration + " seconds.");
    }
}

// Main.java
public class q8 {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // Testing overridden methods
        System.out.println("Testing Car:");
        car.accelerate();
        car.brake();

        System.out.println("\nTesting Bicycle:");
        bicycle.accelerate();
        bicycle.brake();

        // Testing method overloading
        System.out.println("\nTesting method overloading in Car:");
        car.accelerate(60);
        car.accelerate(80, 10);

        System.out.println("\nTesting method overloading in Bicycle:");
        bicycle.accelerate(20);
        bicycle.accelerate(30, 5);
    }
}