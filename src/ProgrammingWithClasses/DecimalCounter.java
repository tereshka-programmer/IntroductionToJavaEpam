package ProgrammingWithClasses;

public class DecimalCounter {
    private int minValue;
    private int maxValue;
    private int value;

    public DecimalCounter() {
        this.minValue = 0;
        this.maxValue = 10;
        this.value = 0;
    }

    public DecimalCounter(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.value = minValue;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        if (value < maxValue) {
            value++;
        }
    }

    public void decrement() {
        if (value > minValue) {
            value--;
        }
    }

    public static void main(String[] args) {
        DecimalCounter counter1 = new DecimalCounter();
        System.out.println("Counter 1: Current Value = " + counter1.getValue());
        counter1.increment();
        counter1.increment();
        counter1.decrement();
        System.out.println("Counter 1: Current Value = " + counter1.getValue());

        DecimalCounter counter2 = new DecimalCounter(5, 15);
        System.out.println("Counter 2: Current Value = " + counter2.getValue());
        counter2.increment();
        counter2.increment();
        counter2.decrement();
        System.out.println("Counter 2: Current Value = " + counter2.getValue());
    }
}
