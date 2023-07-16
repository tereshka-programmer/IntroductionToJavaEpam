package Algoritmization.oneMassive;

public class Three {

    public static void main(String[] args) {
        double[] array = {1.2, -3.5, 0.0, 2.8, -1.0, 0.0, 4.7}; // Пример массива
        int n = array.length; // Размерность массива

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество нулевых элементов: " + zeroCount);
    }

}
