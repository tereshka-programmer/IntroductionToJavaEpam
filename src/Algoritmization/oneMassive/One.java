package Algoritmization.oneMassive;

public class One {

    public static void main(String[] args) {
        int[] array = {12, 7, 9, 15, 21, 30}; // Пример массива A[N]
        int k = 3; // Заданное число K

        int sum = findSumOfMultiples(array, k);

        System.out.println("Сумма элементов, кратных " + k + ": " + sum);
    }

    public static int findSumOfMultiples(int[] array, int k) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }

        return sum;
    }

}
