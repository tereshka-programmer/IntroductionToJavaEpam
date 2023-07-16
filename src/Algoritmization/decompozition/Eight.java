package Algoritmization.decompozition;

public class Eight {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 1;
        int m = 6;

        int sum = calculateSum(array, k, m);
        System.out.println("Сумма элементов от D[" + k + "] до D[" + m + "]: " + sum);
    }

    public static int calculateSum(int[] array, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += array[i];
        }
        return sum;
    }

}
