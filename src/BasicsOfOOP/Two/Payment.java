package BasicsOfOOP.Two;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> items;

    public Payment() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price) {
        Item item = new Item(name, price);
        items.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItem("Товар 1", 10.0);
        payment.addItem("Товар 2", 20.0);
        payment.addItem("Товар 3", 30.0);

        payment.printItems();

        double totalPrice = payment.getTotalPrice();
        System.out.println("Общая стоимость: " + totalPrice);
    }
}
