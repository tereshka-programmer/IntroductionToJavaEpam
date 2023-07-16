package Algoritmization.decompozition;

public class Seven {

    public static void main(String[] args) {
        int start = 1;
        int end = 9;
        long sum = calculateOddFactorialSum(start, end);
        System.out.println("Сумма факториалов нечетных чисел от " + start + " до " + end + " равна " + sum);
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static long calculateOddFactorialSum(int start, int end) {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { // Проверяем, является ли число нечетным
                sum += calculateFactorial(i);
            }
        }
        return sum;
    }

}
