package BasicsOfOOP.Four;

public class Treasure implements Comparable<Treasure> {
    private String name;
    private double price;

    public Treasure(String name, double price) {
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
        return "Сокровище: " + name + ", стоимость: " + price;
    }

    @Override
    public int compareTo(Treasure other) {
        return Double.compare(this.price, other.price);
    }
}

