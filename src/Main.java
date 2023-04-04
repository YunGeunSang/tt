public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Vehicle vehicle = new Vehicle();

        vehicle.run();
        bike.run();

    }
}

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running");
        System.out.println("!!!!!!!!!!!!!!!");
    }
}