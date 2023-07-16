package Algoritmization.sorts;

public class Five {

    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 3};
        insertionSort(array);

        // Выводим отсортированный массив
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Используем двоичный поиск для определения правильной позиции вставки элемента
            int insertIndex = binarySearch(array, key, 0, j);

            // Сдвигаем элементы вправо, чтобы освободить место для вставки
            while (j >= insertIndex) {
                array[j + 1] = array[j];
                j--;
            }

            // Вставляем элемент на правильную позицию
            array[insertIndex] = key;
        }
    }

    public static int binarySearch(int[] array, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

}
