import java.util.ArrayList;

public class ClassTest {
    public static void main(String[] args) {

        
        Vehicle vehicle = new Vehicle("BMW", 250, "Diesel", "13501-122-19", true, 4,680,1.0);
        Car car = new Car("Audi", 270, "Petrol", "000120-124-16", false, 5, true, 4,680,1.0);
        Truck truck = new Truck("Scania", 170, "Diesel", "030023-320-25", false, 200, false, 6,680,1.0);
        MotorCycle motorCycle = new MotorCycle("Yamaha", 220, "Petrol", "006120-124-19", false, 80, true, 2 , 680 ,1.0);
        RaceCar raceCar = new RaceCar("F1", 270, "Petrol", "06501-122-19", true, 4, "Formula One",680,1.0);

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(vehicle);
        vehicleList.add(car);
        vehicleList.add(truck);
        vehicleList.add(motorCycle);
        vehicleList.add(raceCar);

        for (Vehicle v : vehicleList) {
            v.displayInfo();
            System.out.println();
        }
    }
}