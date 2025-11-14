import java.util.ArrayList;

class Vehicle {
    private String brand;
    private double pricePerDay;

    public Vehicle(String brand, double pricePerDay) {
        this.brand = brand;
        this.pricePerDay = pricePerDay;
    }

    public String getBrand() { 
        return brand; 
    }

    public double getPricePerDay() { 
        return pricePerDay; 
    }

    public double calculateRent(int days) {
        return days * pricePerDay;
    }

    public String getType() {
        return "Generic Vehicle";
    }

    @Override
    public String toString() {
        return getType() + " | " + brand + " | Rs." + pricePerDay + "/day";
    }
}

class Car extends Vehicle {
    public Car(String brand, double pricePerDay) {
        super(brand, pricePerDay);
    }

    @Override
    public String getType() {
        return "Car";
    }
}

class Bike extends Vehicle {
    public Bike(String brand, double pricePerDay) {
        super(brand, pricePerDay);
    }

    @Override
    public String getType() {
        return "Bike";
    }
}

class RentalSystem {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void showAllVehicles() {
        System.out.println("\n--- Available Vehicles ---");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(i + ". " + vehicles.get(i));
        }
    }

    public void rentVehicle(int index, int days) {
        if (index < 0 || index >= vehicles.size()) {
            System.out.println("Invalid vehicle index!");
            return;
        }

        Vehicle chosen = vehicles.get(index);
        double cost = chosen.calculateRent(days);

        System.out.println("\nYou rented: " + chosen.getBrand());
        System.out.println("Type: " + chosen.getType());
        System.out.println("Days: " + days);
        System.out.println("Total Cost: Rs." + cost);
    }
}

public class VehicleRental {
    public static void main(String[] args) {

        RentalSystem rs = new RentalSystem();

        // Adding vehicles
        rs.addVehicle(new Car("Honda City", 1800));
        rs.addVehicle(new Car("Hyundai i20", 1200));
        rs.addVehicle(new Bike("Royal Enfield", 500));
        rs.addVehicle(new Bike("Yamaha FZ", 350));

        // Display all vehicles
        rs.showAllVehicles();

        // Renting vehicles
        rs.rentVehicle(1, 3);  // Rent Hyundai i20 for 3 days
        rs.rentVehicle(2, 2);  // Rent Royal Enfield for 2 days
    }
}
