public class MainClass {
    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Corolla", "Red", 180, true, 120.0, "Petrol", 80, 5000);
        Car car2 = new Car("Honda", "Civic", "Blue", 200, false, 150.0, "Diesel", 90, 3000);
        Car car3 = new Car("Tesla", "Model S", "Black", 250, true, 300.0, "Electric", 150, 7000);

        // Display details of each car
        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();

        // Test accelerate method
        car1.accelerate(10);
        System.out.println("Car 1 Speed after acceleration: " + car1.getSpeed() + " km/h");

        // Test brake method
        car2.brake(3);
        System.out.println("Car 2 Speed after braking: " + car2.getSpeed() + " km/h");

        // Test travel method
        car3.travel(100);
        System.out.println("Car 3 kmAge after traveling: " + car3.getKmAge() + " km");

        // Compare speeds of car1 and car2
        Car fasterCar = car1.compareSpeed(car2);
        System.out.println("The faster car is: " + fasterCar.getAutoMaker() + " " + fasterCar.getModel());
    }
}
