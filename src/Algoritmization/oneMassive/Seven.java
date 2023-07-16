package Algoritmization.oneMassive;

public class Seven {

    public static void main(String[] args) {
        double[] sequence = {1.2, 2.5, 3.7, 4.1, 5.3}; // Пример последовательности a1, a2, ..., an
        int n = sequence.length; // Размерность последовательности

        double maxSum = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < n / 2; i++) {
            double sum = sequence[i] + sequence[n - i - 1];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Максимальное значение выражения: " + maxSum);
    }

}
