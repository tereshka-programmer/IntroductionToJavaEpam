package Tasks.Four;

import java.util.Random;

public class Ship implements Runnable {
    private final String name;
    private final int capacity;
    private final Port port;
    private final boolean loading;

    public Ship(String name, int capacity, Port port, boolean loading) {
        this.name = name;
        this.capacity = capacity;
        this.port = port;
        this.loading = loading;
    }

    @Override
    public void run() {
        try {
            if (port.acquireDock()) {
                if (loading) {
                    loadContainers();
                } else {
                    unloadContainers();
                }
                port.releaseDock();
            } else {
                System.out.println(name + " is waiting for a dock.");
                Thread.sleep(1000);
                run(); // Recursive call to try again
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void loadContainers() throws InterruptedException {
        int containers = new Random().nextInt(capacity + 1);
        System.out.println(name + " is loading " + containers + " containers.");
        Thread.sleep(1000);
    }

    private void unloadContainers() throws InterruptedException {
        int containers = new Random().nextInt(capacity + 1);
        System.out.println(name + " is unloading " + containers + " containers.");
        Thread.sleep(1000);
    }
}
