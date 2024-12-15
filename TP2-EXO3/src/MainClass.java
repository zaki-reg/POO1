import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        // Creating three MobilePhone objects
        SimCard sim1 = new SimCard(1, "123-456-7890");
        Ram ram1 = new Ram(8, 2400);
        Processor processor1 = new Processor("Snapdragon", 2.8);
        MobilePhone phone1 = new MobilePhone("BrandA", "ModelX", 6.1f, "Android", 12, sim1, ram1, processor1);

        SimCard sim2 = new SimCard(2, "987-654-3210");
        Ram ram2 = new Ram(6, 2133);
        Processor processor2 = new Processor("Exynos", 2.5);
        MobilePhone phone2 = new MobilePhone("BrandB", "ModelY", 5.8f, "Android", 16, sim2, ram2, processor2);

        SimCard sim3 = new SimCard(3, "555-555-5555");
        Ram ram3 = new Ram(4, 1600);
        Processor processor3 = new Processor("A14", 3.1);
        MobilePhone phone3 = new MobilePhone("BrandC", "ModelZ", 6.5f, "iOS", 10, sim3, ram3, processor3);

        // Display performance indicators of each phone
        System.out.println("Performance indicators:");
        phone1.displayInfo();
        System.out.println();
        phone2.displayInfo();
        System.out.println();
        phone3.displayInfo();
        System.out.println();

        // Compare camera resolution and display the phone with the best camera
        MobilePhone bestCameraPhone = phone1.compare(phone2.compare(phone3));
        System.out.println("Mobile phone with the best camera:");
        bestCameraPhone.displayInfo();

        // Sorting the phones based on performance in an array
        MobilePhone[] phones = { phone1, phone2, phone3 };
        Arrays.sort(phones, (p1, p2) -> Double.compare(p1.performance(), p2.performance()));

        System.out.println("\nPhones sorted by performance (from lowest to highest):");
        for (MobilePhone phone : phones) {
            phone.displayInfo();
            System.out.println();
        }
    }
}
