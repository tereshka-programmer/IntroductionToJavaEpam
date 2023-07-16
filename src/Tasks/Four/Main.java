package Tasks.Four;

public class Main {
    public static void main(String[] args) {
        Port port = new Port(100, 3);

        Thread ship1 = new Thread(new Ship("Ship1", 50, port, true));
        Thread ship2 = new Thread(new Ship("Ship2", 70, port, false));
        Thread ship3 = new Thread(new Ship("Ship3", 80, port, true));

        ship1.start();
        ship2.start();
        ship3.start();
    }
}
