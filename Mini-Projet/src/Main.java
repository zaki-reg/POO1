public class Main {
    public static void main(String[] args) {
        // Create network and add antennas
        Network network = new Network();
        
        Antenna antenna1 = new Antenna(0, 0, 10, 2);
        Antenna antenna2 = new Antenna(15, 0, 10, 2);
        
        System.out.println("Adding antenna1: " + network.addAntenna(antenna1));
        System.out.println("Adding antenna2: " + network.addAntenna(antenna2));
        
        // Create phones with SIM cards
        Phone phone1 = new Phone(100, 5, 0);
        Phone phone2 = new Phone(100, 20, 0);
        
        SimCard sim1 = new SimCard("123456789", 10);
        SimCard sim2 = new SimCard("987654321", 5);
        
        phone1.insertSimCard(sim1);
        phone2.insertSimCard(sim2);
        
        // Test scenarios
        System.out.println("\nTesting calls:");
        
        // Test making calls
        System.out.println("Phone1 making call: " + phone1.makeCall(network));
        System.out.println("Phone2 making call: " + phone2.makeCall(network));
        
        // Test moving out of range
        System.out.println("\nMoving phone1 out of range:");
        phone1.move(30, 30, network);
        System.out.println("Phone1 still in call: " + phone1.isInCall());
        
        // Test low battery scenario
        System.out.println("\nTesting low battery:");
        phone2.setBatteryLevel(0);
        System.out.println("Phone2 can make call: " + phone2.canMakeCall());
    }
}