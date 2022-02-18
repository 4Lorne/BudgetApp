public class Calculations {
    private double price = 0;
    private double tax = 0;

    // Getters and Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return this.tax;
    }

    // Creats the order total
    public double orderTotal(double price) {
        price = getPrice();
        double total = 0;
        total = (price * tax) + price;
        return total;
    }

}