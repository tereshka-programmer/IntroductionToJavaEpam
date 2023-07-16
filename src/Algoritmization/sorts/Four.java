package Algoritmization.sorts;

public class Four {

    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 3};
        int swaps = bubbleSort(array);

        // Выводим отсортированный массив
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nКоличество перестановок: " + swaps);
    }

    public static int bubbleSort(int[] array) {
        int n = array.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем местами два соседних элемента
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                }
            }
        }

        return swaps;
    }

}
