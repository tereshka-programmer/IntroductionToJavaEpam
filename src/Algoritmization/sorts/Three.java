package Algoritmization.sorts;

public class Three {

    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 3};
        selectionSort(array);

        // Выводим отсортированный массив
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Ищем наибольший элемент в оставшейся части массива
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Меняем местами найденный наибольший элемент с элементом на текущей позиции
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }

}
