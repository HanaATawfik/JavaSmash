public class Store {
    // instance fields
    String productType;
    double price;
    double tax = 0.08;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public double getPriceWithTax()
    {
        double totalPrice=price+price*tax;
        return totalPrice;
    }

}
public class Main {
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        double lemonadePrice= lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
    }
}