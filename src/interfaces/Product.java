package interfaces;

public class Product {
    final String name;
    final int price;
    final int count;

    Product(final String name, final int price, final int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String toString() {
        return "{ Name: " + name + ", price: " + price + " RUB, count: " + count + " }";
    }
}
