package Algoritmization.oneMassive;

public class Five {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 4}; // Пример массива
        int n = array.length; // Размерность массива

        for (int i = 0; i < n; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }

}
