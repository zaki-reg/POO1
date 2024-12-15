public class MainClass {
    public static void main(String[] args) {
        // Create Product object
        Product product1 = new Product("Laptop", "solid", 50, 1200.0, 800.0, 15.0);

        // Display initial details of the product
        System.out.println("Initial Product Details:");
        System.out.println("Designation: " + product1.getDesignation());
        System.out.println("Form: " + product1.getForm());
        System.out.println("Stock: " + product1.getStock());
        System.out.println("Sell Price: $" + product1.getSellPrice());
        System.out.println("Buy Price: $" + product1.getBuyPrice());
        System.out.println("Tax: " + product1.getTax() + "%");

        // Test inStock method
        System.out.println("\nChecking if 30 units are in stock: " + product1.inStock(30));

        // Test sell method
        product1.sell(10);
        System.out.println("Stock after selling 10 units: " + product1.getStock());

        // Test calculateProfit method
        double profit = product1.calculateProfit();
        System.out.println("Profit per unit after tax: $" + profit);

        // Test applyDiscount method
        double newPrice = product1.applyDiscount(10);
        System.out.println("New sell price after 10% discount: $" + newPrice);

        // Test restock method
        product1.restock(20, 750.0);
        System.out.println("Stock after restocking 20 units: " + product1.getStock());
        System.out.println("New buy price after restock: $" + product1.getBuyPrice());
    }
}
