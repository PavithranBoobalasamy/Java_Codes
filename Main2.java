class Vehicle {
    Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    Car() {
        super(); 
        System.out.println("Car Constructor");
    }

    @Override
    void start() {
        System.out.println("Car starts with key.");
    }
}

class ElectricCar extends Car {
    String batteryType;

    ElectricCar(String batteryType) {
        super(); 
        this.batteryType = batteryType;
    }

    @Override
    void start() {
        super.start(); 
        System.out.println("ElectricCar starts silently using " + batteryType + " battery.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Lithium-ion");

        tesla.start();
    }
}
