package Algoritmization.oneMassive;

public class Ten {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8}; // Пример целочисленного массива
        int n = array.length; // Количество элементов в массиве

        compressArray(array, n);

        System.out.println("Сжатый массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void compressArray(int[] array, int n) {
        int newIndex = 0;

        for (int i = 0; i < n; i += 2) {
            array[newIndex] = array[i];
            newIndex++;
        }

        for (int i = newIndex; i < n; i++) {
            array[i] = 0;
        }
    }

}
