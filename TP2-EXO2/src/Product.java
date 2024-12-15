public class Product {
    // Attributes
    private String designation;
    private String form;
    private int stock;
    private double sellPrice;
    private double buyPrice;
    private double tax;

    // Constructor
    public Product(String designation, String form, int stock, double sellPrice, double buyPrice, double tax) {
        this.designation = designation;
        this.form = form;
        this.stock = stock;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.tax = tax;
    }

    // Getters and Setters
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getForm() { return form; }
    public void setForm(String form) { this.form = form; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public double getSellPrice() { return sellPrice; }
    public void setSellPrice(double sellPrice) { this.sellPrice = sellPrice; }

    public double getBuyPrice() { return buyPrice; }
    public void setBuyPrice(double buyPrice) { this.buyPrice = buyPrice; }

    public double getTax() { return tax; }
    public void setTax(double tax) { this.tax = tax; }

    // Methods
    public boolean inStock(int quantity) {
        return stock >= quantity;
    }

    public void sell(int quantity) {
        if (inStock(quantity)) {
            stock -= quantity;
            System.out.println(quantity + " units sold. Stock after sale: " + stock);
        } else {
            System.out.println("Insufficient stock for the requested quantity.");
        }
    }

    public double calculateProfit() {
        double profitPerUnit = (sellPrice - buyPrice) * (1 - tax / 100);
        return profitPerUnit;
    }

    public double applyDiscount(double discountRate) {
        sellPrice -= sellPrice * discountRate / 100;
        return sellPrice;
    }

    public void restock(int quantity, double newBuyPrice) {
        stock += quantity;
        buyPrice = newBuyPrice;
        System.out.println(quantity + " units added to stock. New stock: " + stock + ". New buy price: " + buyPrice);
    }
}
