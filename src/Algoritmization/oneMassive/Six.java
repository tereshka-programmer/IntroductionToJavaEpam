package Algoritmization.oneMassive;

public class Six {

    public static void main(String[] args) {
        double[] sequence = {1.2, 2.4, 3.6, 4.8, 5.10, 6.12}; // Пример последовательности N
        int n = sequence.length; // Размерность последовательности

        double sum = 0.0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += sequence[i - 1];
            }
        }

        System.out.println("Сумма чисел с порядковыми номерами, являющимися простыми числами: " + sum);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
