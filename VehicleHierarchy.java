class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

class Truck extends Vehicle {
    @Override
    public void start() {
        System.out.println("Truck engine is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping...");
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myTruck = new Truck();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();

        myTruck.start();
        myTruck.stop();
    }
}
