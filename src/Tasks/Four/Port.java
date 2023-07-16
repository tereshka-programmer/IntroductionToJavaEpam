package Tasks.Four;

import java.util.concurrent.Semaphore;

public class Port {
    private final int capacity;
    private final Semaphore docks;

    public Port(int capacity, int dockCount) {
        this.capacity = capacity;
        this.docks = new Semaphore(dockCount, true);
    }

    public boolean acquireDock() {
        return docks.tryAcquire();
    }

    public void releaseDock() {
        docks.release();
    }

    public int getCapacity() {
        return capacity;
    }
}
