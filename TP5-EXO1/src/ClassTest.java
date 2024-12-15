import java.util.ArrayList;

public class ClassTest {
    public static void main(String[] args) {

        Engine engine1 = new Engine(500, 2); // Creating an Engine object
        Engine engine2 = new Engine(300, 1);
        
        // Creating objects of Vehicle and derived classes
        Vehicle vehicle = new Vehicle("BMW", 250, "Diesel", "13501-122-19", true, engine1);
        Car car = new Car("Audi", 270, "Petrol", "000120-124-16", false, engine2, 5, true);
        Truck truck = new Truck("Scania", 170, "Diesel", "030023-320-25", false, engine1, 200, false);
        MotorCycle motorCycle = new MotorCycle("Yamaha", 220, "Petrol", "006120-124-19", false, engine2, 80, true);

        // Adding all vehicles to the list
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(vehicle);
        vehicleList.add(car);
        vehicleList.add(truck);
        vehicleList.add(motorCycle);

        // Display information for each vehicle
        for (Vehicle v : vehicleList) {
            v.displayInfo();
            System.out.println(); // For readability
        }
    }
}