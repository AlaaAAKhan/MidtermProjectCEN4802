public class DiscountCalculator {
    public static void main(String[] args) {
        double price = 200.0;
        int percentage = 50;

        System.out.println("An item with a price of " + price + "with a " + percentage + "% discount will be $" + calculateDiscount(price, percentage));
    }

    public static double calculateDiscount(double price, int percentage) {
        if (price <= 0 || percentage < 0) {
            return 0;
        }
        return price - (price * percentage / 100);
    }
}
